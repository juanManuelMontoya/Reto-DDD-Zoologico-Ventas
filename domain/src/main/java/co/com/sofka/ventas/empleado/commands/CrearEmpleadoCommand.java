package co.com.sofka.ventas.empleado.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.empleado.values.CuentaId;
import co.com.sofka.ventas.general.values.IdentificacionId;
import co.com.sofka.ventas.general.values.Nombre;

public class CrearEmpleadoCommand extends Command {

    protected Nombre nombre;
    protected CuentaId cuentaId;
    protected IdentificacionId identificacionId;

    public CrearEmpleadoCommand(Nombre nombre, CuentaId cuentaId, IdentificacionId identificacionId) {
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
