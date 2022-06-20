package co.com.sofka.ventas.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.venta.values.PlanId;
import co.com.sofka.ventas.venta.values.VentaId;

public class CambiarPlan extends Command {

    protected PlanId planId;
    protected VentaId ventaId;

    public CambiarPlan(PlanId planId, VentaId ventaId) {
        this.planId = planId;
        this.ventaId = ventaId;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }
}
