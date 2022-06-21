package co.com.sofka.ventas.ticketero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.general.values.Descripcion;
import co.com.sofka.ventas.ticketero.values.Codigo;
import co.com.sofka.ventas.ticketero.values.Color;
import co.com.sofka.ventas.ticketero.values.TicketId;
import co.com.sofka.ventas.ticketero.values.TicketeroId;

public class AgregarTicketCommand extends Command {

    protected TicketeroId ticketeroId;
    protected TicketId ticketId;
    protected Codigo codigo;
    protected Color color;
    protected Descripcion descripcion;

    public AgregarTicketCommand(TicketeroId ticketeroId, TicketId ticketId, Codigo codigo, Color color, Descripcion descripcion) {
        this.ticketeroId = ticketeroId;
        this.ticketId = ticketId;
        this.codigo = codigo;
        this.color = color;
        this.descripcion = descripcion;
    }

    public TicketeroId getTicketeroId() {
        return ticketeroId;
    }

    public TicketId getTicketId() {
        return ticketId;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public Color getColor() {
        return color;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
