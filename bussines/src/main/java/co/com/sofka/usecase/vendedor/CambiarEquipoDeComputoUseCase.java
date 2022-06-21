package co.com.sofka.usecase.vendedor;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.empleado.values.EquipoDeComputoId;
import co.com.sofka.ventas.vendedor.Vendedor;
import co.com.sofka.ventas.vendedor.commands.CambiarEquipoDeComputo;
import co.com.sofka.ventas.vendedor.values.PuntoDeVentaID;

public class CambiarEquipoDeComputoUseCase extends UseCase<RequestCommand<CambiarEquipoDeComputo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarEquipoDeComputo> input) {

        var command = input.getCommand();

        var vendedor = new Vendedor(command.getVendedorId(),new PuntoDeVentaID("123"), new EquipoDeComputoId("321"), new EmpleadoId("132"));

        vendedor.cambiarEquipoDeComputo(command.getEquipoDeComputoId());

        emit().onResponse(new ResponseEvents(vendedor.getUncommittedChanges()));
    }
}
