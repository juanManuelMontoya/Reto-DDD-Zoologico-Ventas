package co.com.sofka.usecase.ticketero;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.ticketero.Ticketero;
import co.com.sofka.ventas.ticketero.commands.CambiarEntradaCommand;
import co.com.sofka.ventas.ticketero.values.EntradaId;

public class CambiarEntradaUseCase extends UseCase<RequestCommand<CambiarEntradaCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarEntradaCommand> input) {
        var command = input.getCommand();

        var ticketero = new Ticketero(command.getTicketeroId(), new EmpleadoId("123"), new EntradaId("1"));

        ticketero.cambiarEntrada(command.getEntradaId());

        emit().onResponse(new ResponseEvents(ticketero.getUncommittedChanges()));
    }
}
