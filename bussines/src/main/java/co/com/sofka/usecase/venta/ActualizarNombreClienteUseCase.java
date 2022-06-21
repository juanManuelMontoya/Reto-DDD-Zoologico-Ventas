package co.com.sofka.usecase.venta;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ventas.vendedor.values.VendedorId;
import co.com.sofka.ventas.venta.Venta;
import co.com.sofka.ventas.venta.commands.ActualizarNombreCliente;
import co.com.sofka.ventas.venta.values.ClienteId;
import co.com.sofka.ventas.venta.values.PlanId;

public class ActualizarNombreClienteUseCase extends UseCase<RequestCommand<ActualizarNombreCliente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarNombreCliente> input) {
        /*var command = input.getCommand();

        var venta = new Venta(command.getVentaId(),new VendedorId("321"),command.getClienteId(),new PlanId("132"));

        venta.actualizarNombreDeCLiente(command.getClienteId(),command.getNombre());*/

    }
}
