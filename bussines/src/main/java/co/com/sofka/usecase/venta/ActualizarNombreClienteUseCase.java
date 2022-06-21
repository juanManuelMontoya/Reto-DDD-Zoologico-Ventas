package co.com.sofka.usecase.venta;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ventas.venta.commands.ActualizarNombreClienteCommand;

public class ActualizarNombreClienteUseCase extends UseCase<RequestCommand<ActualizarNombreClienteCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarNombreClienteCommand> input) {
        /*var command = input.getCommand();

        var venta = new Venta(command.getVentaId(),new VendedorId("321"),command.getClienteId(),new PlanId("132"));

        venta.actualizarNombreDeCLiente(command.getClienteId(),command.getNombre());*/

    }
}
