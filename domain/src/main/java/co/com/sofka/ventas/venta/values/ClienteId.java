package co.com.sofka.ventas.venta.values;

import co.com.sofka.domain.generic.Identity;

public class ClienteId extends Identity {
    public ClienteId(String id) {
        super(id);
    }

    public ClienteId of (String id){
        return new ClienteId(id);
    }
}
