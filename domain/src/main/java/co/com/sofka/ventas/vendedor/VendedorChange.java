package co.com.sofka.ventas.vendedor;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.ventas.vendedor.events.EmpleadoCambiado;
import co.com.sofka.ventas.vendedor.events.EquipoDeComputoCambiado;
import co.com.sofka.ventas.vendedor.events.PuntoDeVentaCambiado;
import co.com.sofka.ventas.vendedor.events.VendedorCreado;

public class VendedorChange extends EventChange {
    public VendedorChange(Vendedor vendedor) {

        apply((VendedorCreado event) -> {
            vendedor.empleadoId = event.getEmpleadoId();
            vendedor.equipoDeComputoId = event.getEquipoDeComputoId();
            vendedor.puntoDeVentaId = event.getPuntoDeVentaID();
        });

        apply((EquipoDeComputoCambiado event) -> {
            vendedor.equipoDeComputoId = event.getEquipoDeComputoId();
        });

        apply((PuntoDeVentaCambiado event) -> {
            vendedor.puntoDeVentaId = event.getPuntoDeVentaID();
        });

        apply((EmpleadoCambiado event) -> {
            vendedor.empleadoId = event.getEmpleadoId();
        });
    }
}
