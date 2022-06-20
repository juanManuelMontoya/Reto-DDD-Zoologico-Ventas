package co.com.sofka.ventas.general.values;

import co.com.sofka.domain.generic.Identity;

public class IdentificacionId extends Identity {

    public IdentificacionId(String id) {
        super(id);
    }

    public IdentificacionId of (String id){
        return new IdentificacionId(id);
    }
}
