package co.com.sofka.usecase.venta;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ventas.venta.commands.CambiarPlan;
import co.com.sofka.ventas.venta.events.PlanCambiado;
import co.com.sofka.ventas.venta.values.PlanId;
import co.com.sofka.ventas.venta.values.VentaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CambiarPlanUseCaseTest {

    @Test
    void cambiarPlan(){

        var ventaId = new VentaId("3142");
        var planId = new PlanId("2");

        var command = new CambiarPlan(planId,ventaId);

        var usecase = new CambiarPlanUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        var event = (PlanCambiado) events.get(1);

        Assertions.assertEquals("2", event.getPlanId().value());
    }
}