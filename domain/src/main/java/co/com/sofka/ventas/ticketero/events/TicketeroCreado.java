package co.com.sofka.ventas.ticketero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.ticketero.values.EntradaId;

public class TicketeroCreado extends DomainEvent {

    private final EmpleadoId empleadoId;
    private final EntradaId entradaId;
    public TicketeroCreado(EmpleadoId empleadoId, EntradaId entradaId) {
        super("co.sofka.ventas.ticketerocreado");
        this.empleadoId = empleadoId;
        this.entradaId = entradaId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public EntradaId getEntradaId() {
        return entradaId;
    }
}
