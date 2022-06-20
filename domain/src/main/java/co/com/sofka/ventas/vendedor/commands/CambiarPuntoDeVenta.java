package co.com.sofka.ventas.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.vendedor.values.PuntoDeVentaID;
import co.com.sofka.ventas.vendedor.values.VendedorId;

public class CambiarPuntoDeVenta extends Command {

    protected PuntoDeVentaID puntoDeVentaID;
    protected VendedorId vendedorId;

    public CambiarPuntoDeVenta(PuntoDeVentaID puntoDeVentaID, VendedorId vendedorId) {
        this.puntoDeVentaID = puntoDeVentaID;
        this.vendedorId = vendedorId;
    }

    public PuntoDeVentaID getPuntoDeVentaID() {
        return puntoDeVentaID;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }
}
