package co.com.sofka.usecase.ticketero;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ventas.ticketero.commands.CambiarEntrada;
import co.com.sofka.ventas.ticketero.events.EntradaCambiada;
import co.com.sofka.ventas.ticketero.values.EntradaId;
import co.com.sofka.ventas.ticketero.values.TicketeroId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CambiarEntradaUseCaseTest {

    @Test
    void cambiarEntrada(){

        var entradaId   = new EntradaId("2");
        var ticketeroId = new TicketeroId("123");

        var command = new CambiarEntrada(ticketeroId,entradaId);

        var useCase = new CambiarEntradaUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        var event = (EntradaCambiada) events.get(1);

        Assertions.assertEquals("2", event.getEntradaId().value());
    }

}