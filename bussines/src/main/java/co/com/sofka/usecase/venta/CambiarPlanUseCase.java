package co.com.sofka.usecase.venta;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ventas.vendedor.values.VendedorId;
import co.com.sofka.ventas.venta.Venta;
import co.com.sofka.ventas.venta.commands.CambiarPlan;
import co.com.sofka.ventas.venta.values.ClienteId;
import co.com.sofka.ventas.venta.values.PlanId;

public class CambiarPlanUseCase extends UseCase<RequestCommand<CambiarPlan>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarPlan> input) {
        var command = input.getCommand();

        var venta = new Venta(command.getVentaId(),new VendedorId("321"),new ClienteId("1193"),new PlanId("132"));

        venta.cambiarPlan(command.getPlanId());

        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));
    }
}
