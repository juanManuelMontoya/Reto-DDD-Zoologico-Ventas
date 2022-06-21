package co.com.sofka.usecase.vendedor;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ventas.vendedor.Vendedor;
import co.com.sofka.ventas.vendedor.commands.CrearVendedorCommand;
import co.com.sofka.ventas.vendedor.values.VendedorId;

public class CrearVendedorUseCase extends UseCase<RequestCommand<CrearVendedorCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearVendedorCommand> input) {
        var command = input.getCommand();

        var vendedor = new Vendedor(new VendedorId("312"), command.getPuntoDeVentaID(),command.getEquipoDeComputoId(),command.getEmpleadoId());

        emit().onResponse(new ResponseEvents(vendedor.getUncommittedChanges()));
    }
}
