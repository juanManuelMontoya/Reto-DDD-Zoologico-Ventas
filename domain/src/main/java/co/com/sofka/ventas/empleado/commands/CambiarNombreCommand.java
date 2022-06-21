package co.com.sofka.ventas.empleado.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.empleado.Cuenta;
import co.com.sofka.ventas.empleado.values.CuentaId;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.general.values.Nombre;

public class CambiarNombreCommand extends Command {

    protected Nombre nombre;
    protected EmpleadoId empleadoId;
    protected CuentaId cuentaId;

    public CambiarNombreCommand(CuentaId cuentaId,Nombre nombre, EmpleadoId empleadoId) {
        this.nombre = nombre;
        this.empleadoId = empleadoId;
        this.cuentaId = cuentaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
