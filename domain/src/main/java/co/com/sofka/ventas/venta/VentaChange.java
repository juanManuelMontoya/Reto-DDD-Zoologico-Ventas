package co.com.sofka.ventas.venta;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.ventas.venta.events.NombreClienteActualizado;
import co.com.sofka.ventas.venta.events.PlanCambiado;
import co.com.sofka.ventas.venta.events.VentaCreada;

public class VentaChange extends EventChange {
    public VentaChange(Venta venta) {

        apply((VentaCreada event) -> {
            venta.clienteId = event.getClienteId();
            venta.vendedorId = event.getVendedorId();
            venta.planId = event.getPlanId();
        });

        apply((PlanCambiado event) -> {
            venta.planId = event.getPlanId();
        });
    }
}
