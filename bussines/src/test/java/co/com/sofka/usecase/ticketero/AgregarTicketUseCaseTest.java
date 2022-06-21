package co.com.sofka.usecase.ticketero;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ventas.general.values.Descripcion;
import co.com.sofka.ventas.ticketero.commands.AgregarTicket;
import co.com.sofka.ventas.ticketero.events.TicketAgregado;
import co.com.sofka.ventas.ticketero.values.Codigo;
import co.com.sofka.ventas.ticketero.values.Color;
import co.com.sofka.ventas.ticketero.values.TicketId;
import co.com.sofka.ventas.ticketero.values.TicketeroId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgregarTicketUseCaseTest {

    @Test
    void agregarTicket(){
        var ticketeroId = new TicketeroId("123");
        var ticketId    = new TicketId("31");
        var color       = new Color("Rojo");
        var codigo      = new Codigo("1234");
        var descripcion = new Descripcion("Manilla para entrar al zoologico");

        var command = new AgregarTicket(ticketeroId,ticketId,codigo,color,descripcion);

        var useCase = new AgregarTicketUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (TicketAgregado) events.get(1);

        Assertions.assertEquals("31", event.getTicketId().value());
        Assertions.assertEquals("Rojo",event.getColor().value());
        Assertions.assertEquals("1234", event.getCodigo().value());
        Assertions.assertEquals("Manilla para entrar al zoologico", event.getDescripcion().value());
    }

}