package co.com.sofka.ventas.ticketero;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.empleado.Empleado;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.ticketero.events.EmpleadoAsignado;
import co.com.sofka.ventas.ticketero.events.EntradaCambiada;
import co.com.sofka.ventas.ticketero.events.TicketAgregado;
import co.com.sofka.ventas.ticketero.events.TicketeroCreado;
import co.com.sofka.ventas.ticketero.values.*;
import co.com.sofka.ventas.general.values.Descripcion;

import java.util.List;
import java.util.Set;

public class Ticketero extends AggregateEvent<TicketeroId> {

    protected EmpleadoId empleadoId;
    protected Set<Ticket> tickets;
    protected EntradaId entradaId;

    public Ticketero(TicketeroId entityId, EmpleadoId empleadoId, EntradaId entradaId) {
        super(entityId);
        appendChange(new TicketeroCreado(empleadoId,entradaId)).apply();
    }

    private Ticketero(TicketeroId entityId){
        super(entityId);
        subscribe(new TicketeroChange(this));
    }

    public static Ticketero from(TicketeroId ticketeroId, List<DomainEvent> events){
        var ticketero = new Ticketero(ticketeroId);
        events.forEach(ticketero::applyEvent);
        return ticketero;
    }
    public void agregarTicket(TicketId ticketId, Codigo codigo, Color color, Descripcion descripcion){
        appendChange(new TicketAgregado(ticketId,codigo,color,descripcion)).apply();
    }

    public void cambiarEntrada(EntradaId entradaId){
        appendChange(new EntradaCambiada(entradaId)).apply();
    }

    public void asignarEmpleado(EmpleadoId empleadoId){
        appendChange(new EmpleadoAsignado(empleadoId)).apply();
    }

    public EmpleadoId empleadoId() {
        return empleadoId;
    }

    public Set<Ticket> tickets() {
        return tickets;
    }

    public EntradaId entradaId() {
        return entradaId;
    }
}
