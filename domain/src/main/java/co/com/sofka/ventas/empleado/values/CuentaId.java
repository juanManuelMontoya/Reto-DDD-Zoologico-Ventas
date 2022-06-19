package co.com.sofka.ventas.empleado.values;

import co.com.sofka.domain.generic.Identity;

public class CuentaId extends Identity {

    public CuentaId(String id) {
        super(id);
    }

    public CuentaId of (String id){
        return new CuentaId(id);
    }
}
