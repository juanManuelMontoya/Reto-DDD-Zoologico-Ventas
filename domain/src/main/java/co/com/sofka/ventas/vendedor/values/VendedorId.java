package co.com.sofka.ventas.vendedor.values;

import co.com.sofka.domain.generic.Identity;

public class VendedorId extends Identity {

    public VendedorId(String id) {
        super(id);
    }

    public VendedorId of (String id){
        return new VendedorId(id);
    }
}
