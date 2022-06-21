package co.com.sofka.usecase.ticketero;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ventas.ticketero.Ticketero;
import co.com.sofka.ventas.ticketero.commands.CrearTicketeroCommand;
import co.com.sofka.ventas.ticketero.values.TicketeroId;

public class CrearTicketeroUseCase extends UseCase<RequestCommand<CrearTicketeroCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearTicketeroCommand> input) {

        var command = input.getCommand();

        var ticketero = new Ticketero(new TicketeroId("123"), command.getEmpleadoId(), command.getEntradaId());

        emit().onResponse(new ResponseEvents(ticketero.getUncommittedChanges()));
    }
}
