package co.com.sofka.ventas.venta.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.ventas.Vendedor.values.VendedorId;

public class VentaId extends Identity {
    public VentaId(String id) {
        super(id);
    }

    public VentaId of (String id){
        return new VentaId(id);
    }
}
