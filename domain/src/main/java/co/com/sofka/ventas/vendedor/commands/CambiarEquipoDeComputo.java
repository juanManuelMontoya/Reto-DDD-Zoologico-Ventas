package co.com.sofka.ventas.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.empleado.values.EquipoDeComputoId;
import co.com.sofka.ventas.vendedor.values.VendedorId;

public class CambiarEquipoDeComputo extends Command {

    protected EquipoDeComputoId equipoDeComputoId;
    protected VendedorId vendedorId;

    public CambiarEquipoDeComputo(EquipoDeComputoId equipoDeComputoId, VendedorId vendedorId) {
        this.equipoDeComputoId = equipoDeComputoId;
        this.vendedorId = vendedorId;
    }

    public EquipoDeComputoId getEquipoDeComputoId() {
        return equipoDeComputoId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }
}
