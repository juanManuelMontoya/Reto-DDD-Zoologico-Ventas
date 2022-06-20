package co.com.sofka.ventas.empleado.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.general.values.Nombre;

public class CambiarNombre extends Command {

    protected Nombre nombre;
    protected EmpleadoId empleadoId;

    public CambiarNombre(Nombre nombre, EmpleadoId empleadoId) {
        this.nombre = nombre;
        this.empleadoId = empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
