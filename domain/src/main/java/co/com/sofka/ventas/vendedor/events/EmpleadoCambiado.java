package co.com.sofka.ventas.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.empleado.values.EmpleadoId;

public class EmpleadoCambiado extends DomainEvent {
    private final EmpleadoId empleadoId;
    public EmpleadoCambiado(EmpleadoId empleadoId) {
        super("co.sofka.ventas.empleadocambiado");
        this.empleadoId = empleadoId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
