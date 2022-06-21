package co.com.sofka.ventas.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.empleado.values.EquipoDeComputoId;
import co.com.sofka.ventas.vendedor.values.PuntoDeVentaID;

public class CrearVendedorCommand extends Command {

    protected PuntoDeVentaID puntoDeVentaID;
    protected EquipoDeComputoId equipoDeComputoId;
    protected EmpleadoId empleadoId;

    public CrearVendedorCommand(PuntoDeVentaID puntoDeVentaID, EquipoDeComputoId equipoDeComputoId, EmpleadoId empleadoId) {
        this.puntoDeVentaID = puntoDeVentaID;
        this.equipoDeComputoId = equipoDeComputoId;
        this.empleadoId = empleadoId;
    }

    public PuntoDeVentaID getPuntoDeVentaID() {
        return puntoDeVentaID;
    }

    public EquipoDeComputoId getEquipoDeComputoId() {
        return equipoDeComputoId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
