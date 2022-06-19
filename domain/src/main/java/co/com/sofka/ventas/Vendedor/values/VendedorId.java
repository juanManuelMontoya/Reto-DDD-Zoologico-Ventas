package co.com.sofka.ventas.Vendedor.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.ventas.empleado.values.CuentaId;

public class VendedorId extends Identity {

    public VendedorId(String id) {
        super(id);
    }

    public VendedorId of (String id){
        return new VendedorId(id);
    }
}
