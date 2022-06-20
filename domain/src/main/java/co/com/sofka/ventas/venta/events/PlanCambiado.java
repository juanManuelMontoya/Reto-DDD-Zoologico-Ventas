package co.com.sofka.ventas.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.venta.Plan;
import co.com.sofka.ventas.venta.values.PlanId;

public class PlanCambiado extends DomainEvent {

    private final PlanId planId;
    public PlanCambiado(PlanId planId) {
        super("co.sofka.ventas.plancambiado");
        this.planId = planId;
    }

    public PlanId getPlanId() {
        return planId;
    }
}
