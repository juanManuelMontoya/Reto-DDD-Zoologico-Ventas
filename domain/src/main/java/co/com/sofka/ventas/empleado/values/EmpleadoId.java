package co.com.sofka.ventas.empleado.values;

import co.com.sofka.domain.generic.Identity;

public class EmpleadoId extends Identity {

    public EmpleadoId(String id) {
        super(id);
    }

    public EmpleadoId of (String id){
        return new EmpleadoId(id);
    }
}
