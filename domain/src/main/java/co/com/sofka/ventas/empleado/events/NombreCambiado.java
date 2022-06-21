package co.com.sofka.ventas.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.empleado.values.CuentaId;
import co.com.sofka.ventas.general.values.Nombre;

public class NombreCambiado extends DomainEvent {

    private final Nombre nombre;

    private final CuentaId cuentaId;

    public NombreCambiado(CuentaId cuentaId,Nombre nombre) {
        super("co.sofka.ventas.nombreCreado");
        this.nombre = nombre;
        this.cuentaId = cuentaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
