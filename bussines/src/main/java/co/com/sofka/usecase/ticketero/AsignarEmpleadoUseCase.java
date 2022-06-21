package co.com.sofka.usecase.ticketero;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.ticketero.Ticketero;
import co.com.sofka.ventas.ticketero.commands.AsignarEmpleado;
import co.com.sofka.ventas.ticketero.values.EntradaId;

public class AsignarEmpleadoUseCase extends UseCase<RequestCommand<AsignarEmpleado>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarEmpleado> input) {

        var command = input.getCommand();

        var ticketero = new Ticketero(command.getTicketeroId(), new EmpleadoId("123"), new EntradaId("1"));

        ticketero.asignarEmpleado(command.getEmpleadoId());

        emit().onResponse(new ResponseEvents(ticketero.getUncommittedChanges()));
    }
}
