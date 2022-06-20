package co.com.sofka.ventas.ticketero;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.ventas.ticketero.events.EmpleadoAsignado;
import co.com.sofka.ventas.ticketero.events.EntradaCambiada;
import co.com.sofka.ventas.ticketero.events.TicketAgregado;
import co.com.sofka.ventas.ticketero.events.TicketeroCreado;

import java.util.HashSet;

public class TicketeroChange extends EventChange {
    public TicketeroChange(Ticketero ticketero) {

        apply((TicketeroCreado event) -> {
            ticketero.empleadoId = event.getEmpleadoId();
            ticketero.entradaId = event.getEntradaId();
            ticketero.tickets = new HashSet<>();
        });

        apply((TicketAgregado event)-> {
            ticketero.tickets.add(new Ticket(event.getTicketId(),event.getCodigo(),event.getColor(),event.getDescripcion()));
        });
        apply((EntradaCambiada event) -> {
            ticketero.entradaId = event.getEntradaId();
        });

        apply((EmpleadoAsignado event) -> {
            ticketero.empleadoId = event.getEmpleadoId();
        });

    }
}
