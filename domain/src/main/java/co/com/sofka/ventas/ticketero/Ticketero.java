package co.com.sofka.ventas.ticketero;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.ventas.empleado.Empleado;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.ticketero.events.EmpleadoAsignado;
import co.com.sofka.ventas.ticketero.events.EntradaCambiada;
import co.com.sofka.ventas.ticketero.events.TicketAgregado;
import co.com.sofka.ventas.ticketero.events.TicketeroCreado;
import co.com.sofka.ventas.ticketero.values.*;
import co.com.sofka.ventas.values.Descripcion;
import co.com.sofka.ventas.venta.VentaChange;
import co.com.sofka.ventas.venta.values.VentaId;

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
