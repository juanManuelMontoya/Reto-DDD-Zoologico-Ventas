package co.com.sofka.ventas.empleado;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.ventas.empleado.events.EmpleadoCreado;
import co.com.sofka.ventas.empleado.events.NombreCambiado;

public class EmpleadoChange extends EventChange {
    public EmpleadoChange(Empleado empleado) {

        apply((EmpleadoCreado event) -> {
            empleado.nombre = event.getNombre();
            empleado.cuentaId = event.getCuentaId();
            empleado.identificacionId = event.getIdentificacionId();
        });

        apply((NombreCambiado event) -> {
            empleado.nombre = event.getNombre();
        });
    }
}
