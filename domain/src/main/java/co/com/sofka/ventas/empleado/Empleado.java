package co.com.sofka.ventas.empleado;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.AggregateRoot;
import co.com.sofka.ventas.empleado.events.EmpleadoCreado;
import co.com.sofka.ventas.empleado.events.NombreCambiado;
import co.com.sofka.ventas.empleado.values.CuentaId;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.values.IdentificacionId;
import co.com.sofka.ventas.values.Nombre;

public class Empleado extends AggregateEvent<EmpleadoId> {

    protected Nombre nombre;
    protected CuentaId cuentaId;
    protected IdentificacionId identificacionId;

    public Empleado(EmpleadoId entityId, Nombre nombre, CuentaId cuentaId, IdentificacionId identificacionId) {
        super(entityId);
        appendChange(new EmpleadoCreado(nombre,cuentaId,identificacionId)).apply();
    }

    private Empleado(EmpleadoId entityId){
        super(entityId);
        subscribe(new EmpleadoChange(this));
    }

    public void cambiarNombre(Nombre nombre){
        appendChange(new NombreCambiado(nombre)).apply();
    }

    public Nombre nombre() {
        return nombre;
    }

    public CuentaId cuentaId() {
        return cuentaId;
    }

    public IdentificacionId identificacionId() {
        return identificacionId;
    }
}
