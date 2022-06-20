package co.com.sofka.ventas.venta.values;

import co.com.sofka.domain.generic.Identity;

public class PlanId extends Identity {

    public PlanId(String id) {
        super(id);
    }

    public PlanId of (String id){
        return new PlanId(id);
    }
}
