package co.com.sofka.ventas.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.vendedor.values.VendedorId;
import co.com.sofka.ventas.venta.values.ClienteId;
import co.com.sofka.ventas.venta.values.PlanId;

public class CrearVentaCommand extends Command {

    protected VendedorId vendedorId;
    protected ClienteId clienteId;
    protected PlanId planId;

    public CrearVentaCommand(VendedorId vendedorId, ClienteId clienteId, PlanId planId) {
        this.vendedorId = vendedorId;
        this.clienteId = clienteId;
        this.planId = planId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public PlanId getPlanId() {
        return planId;
    }
}
