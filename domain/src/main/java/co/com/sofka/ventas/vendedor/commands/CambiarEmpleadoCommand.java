package co.com.sofka.ventas.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.vendedor.values.VendedorId;

public class CambiarEmpleadoCommand extends Command {

    protected EmpleadoId empleadoId;
    protected VendedorId vendedorId;

    public CambiarEmpleadoCommand(EmpleadoId empleadoId, VendedorId vendedorId) {
        this.empleadoId = empleadoId;
        this.vendedorId = vendedorId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }
}
