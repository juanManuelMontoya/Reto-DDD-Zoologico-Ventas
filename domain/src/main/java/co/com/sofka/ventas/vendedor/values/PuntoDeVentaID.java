package co.com.sofka.ventas.vendedor.values;

import co.com.sofka.domain.generic.Identity;

public class PuntoDeVentaID extends Identity {

    public PuntoDeVentaID(String id) {
        super(id);
    }

    public PuntoDeVentaID of (String id){
        return new PuntoDeVentaID(id);
    }
}
