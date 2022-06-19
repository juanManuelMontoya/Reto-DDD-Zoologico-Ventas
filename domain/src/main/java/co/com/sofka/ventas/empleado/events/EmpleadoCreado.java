package co.com.sofka.ventas.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.empleado.Cuenta;
import co.com.sofka.ventas.empleado.values.CuentaId;
import co.com.sofka.ventas.values.IdentificacionId;
import co.com.sofka.ventas.values.Nombre;

public class EmpleadoCreado extends DomainEvent {

    private final Nombre nombre;
    private final CuentaId cuentaId;
    private final IdentificacionId identificacionId;
    public EmpleadoCreado(Nombre nombre, CuentaId cuentaId, IdentificacionId identificacionId) {
        super("co.sofka.ventas.empleadoCreado");
        this.nombre = nombre;
        this.cuentaId = cuentaId;
        this.identificacionId = identificacionId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public IdentificacionId getIdentificacionId() {
        return identificacionId;
    }
}
