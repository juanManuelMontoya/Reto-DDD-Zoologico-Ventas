package co.com.sofka.ventas.empleado;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.empleado.events.ContrasenaCuentaCambiada;
import co.com.sofka.ventas.empleado.events.EmpleadoCreado;
import co.com.sofka.ventas.empleado.events.NombreCambiado;
import co.com.sofka.ventas.empleado.values.Contrasena;
import co.com.sofka.ventas.empleado.values.CuentaId;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.general.values.IdentificacionId;
import co.com.sofka.ventas.general.values.Nombre;

import java.util.List;

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

    public static Empleado from(EmpleadoId empleadoId, List<DomainEvent> events){
        var empleado = new Empleado(empleadoId);
        events.forEach(empleado::applyEvent);
        return empleado;
    }

    public void cambiarNombre(CuentaId cuentaId,Nombre nombre){
        appendChange(new NombreCambiado(cuentaId,nombre)).apply();
    }

    public Nombre nombre() {
        return nombre;
    }

    public void cambiarContrasenaCuenta(CuentaId cuentaId, Contrasena contrasena){
        appendChange(new ContrasenaCuentaCambiada(cuentaId,contrasena)).apply();
    }
    public CuentaId cuentaId() {
        return cuentaId;
    }

    public IdentificacionId identificacionId() {
        return identificacionId;
    }
}
