package co.com.sofka.ventas.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.values.Nombre;

public class NombreEmpleadoActualizado extends DomainEvent {

    private final EmpleadoId empleadoId;
    private final Nombre nombre;
    public NombreEmpleadoActualizado(EmpleadoId empleadoId, Nombre nombre) {
        super("co.sofka.ventas.nombreempleadoactualizado");
        this.empleadoId = empleadoId;
        this.nombre = nombre;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
