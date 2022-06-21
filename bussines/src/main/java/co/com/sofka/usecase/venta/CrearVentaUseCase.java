package co.com.sofka.usecase.venta;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ventas.venta.Venta;
import co.com.sofka.ventas.venta.commands.CrearVentaCommand;
import co.com.sofka.ventas.venta.values.VentaId;

public class CrearVentaUseCase extends UseCase<RequestCommand<CrearVentaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearVentaCommand> input) {

        var command = input.getCommand();

        var venta = new Venta(new VentaId("123334"), command.getVendedorId(), command.getClienteId(),command.getPlanId());

        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));
    }
}
