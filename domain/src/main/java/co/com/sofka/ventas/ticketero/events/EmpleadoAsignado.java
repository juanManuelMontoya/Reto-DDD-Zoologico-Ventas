package co.com.sofka.ventas.ticketero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.empleado.values.EmpleadoId;

public class EmpleadoAsignado extends DomainEvent {

    private final EmpleadoId empleadoId;

    public EmpleadoAsignado(EmpleadoId empleadoId) {
        super("co.sofka.ventas.empleadoasignado");
        this.empleadoId = empleadoId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
