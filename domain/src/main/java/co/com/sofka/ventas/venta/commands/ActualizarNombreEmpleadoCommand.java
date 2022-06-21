package co.com.sofka.ventas.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.general.values.Nombre;
import co.com.sofka.ventas.venta.values.VentaId;

public class ActualizarNombreEmpleadoCommand extends Command {

    protected EmpleadoId empleadoId;
    protected Nombre nombre;
    protected VentaId ventaId;

    public ActualizarNombreEmpleadoCommand(EmpleadoId empleadoId, Nombre nombre, VentaId ventaId) {
        this.empleadoId = empleadoId;
        this.nombre = nombre;
        this.ventaId = ventaId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public VentaId getVentaId() {
        return ventaId;
    }
}
