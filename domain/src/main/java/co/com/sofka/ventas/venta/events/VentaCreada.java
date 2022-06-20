package co.com.sofka.ventas.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.Vendedor.Vendedor;
import co.com.sofka.ventas.Vendedor.values.VendedorId;
import co.com.sofka.ventas.venta.values.ClienteId;
import co.com.sofka.ventas.venta.values.PlanId;

public class VentaCreada extends DomainEvent {

    private final VendedorId vendedorId;
    private final ClienteId clienteId;
    private final PlanId planId;

    public VentaCreada(VendedorId vendedorId, ClienteId clienteId, PlanId planId) {
        super("co.sofka.ventas.ventacreada");
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
