package co.com.sofka.ventas.ticketero;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ventas.ticketero.values.Codigo;
import co.com.sofka.ventas.ticketero.values.Color;
import co.com.sofka.ventas.ticketero.values.TicketId;
import co.com.sofka.ventas.general.values.Descripcion;

public class Ticket extends Entity<TicketId> {

    protected Codigo codigo;
    protected Color color;
    protected Descripcion descripcion;

    public Ticket(TicketId entityId, Codigo codigo, Color color, Descripcion descripcion) {
        super(entityId);
        this.codigo = codigo;
        this.color = color;
        this.descripcion = descripcion;
    }

    public void cambiarCodigo(Codigo codigo){
        this.codigo = codigo;
    }

    public void cambiarColor(Color color){
        this.color = color;
    }

    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion = descripcion;
    }

    public Codigo codigo() {
        return codigo;
    }

    public Color color() {
        return color;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
