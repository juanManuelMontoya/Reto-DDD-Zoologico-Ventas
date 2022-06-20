package co.com.sofka.ventas.empleado.values;

import co.com.sofka.domain.generic.Identity;

public class EquipoDeComputoId extends Identity {

    public EquipoDeComputoId(String id) {
        super(id);
    }

    public EquipoDeComputoId of (String id){
        return new EquipoDeComputoId(id);
    }
}
