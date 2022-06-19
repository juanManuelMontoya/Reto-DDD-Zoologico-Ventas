package co.com.sofka.ventas.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.ventas.empleado.values.CuentaId;

public class IdentificacionId extends Identity {

    public IdentificacionId(String id) {
        super(id);
    }

    public IdentificacionId of (String id){
        return new IdentificacionId(id);
    }
}
