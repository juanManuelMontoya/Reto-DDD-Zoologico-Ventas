package co.com.sofka.ventas.ticketero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.ticketero.values.Codigo;
import co.com.sofka.ventas.ticketero.values.Color;
import co.com.sofka.ventas.ticketero.values.TicketId;
import co.com.sofka.ventas.values.Descripcion;

public class TicketAgregado extends DomainEvent {

    private final TicketId ticketId;
    private final Codigo codigo;
    private final Color color;
    private final Descripcion descripcion;

    public TicketAgregado(TicketId ticketId, Codigo codigo, Color color, Descripcion descripcion) {
        super("co.sofka.ventas.ticketagregado");
        this.ticketId = ticketId;
        this.codigo = codigo;
        this.color = color;
        this.descripcion = descripcion;
    }

    public TicketId getTicketId() {
        return ticketId;
    }

    public Color getColor() {
        return color;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
