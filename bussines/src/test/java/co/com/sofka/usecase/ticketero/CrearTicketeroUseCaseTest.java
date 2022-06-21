package co.com.sofka.usecase.ticketero;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.ticketero.commands.CrearTicketeroCommand;
import co.com.sofka.ventas.ticketero.events.TicketeroCreado;
import co.com.sofka.ventas.ticketero.values.EntradaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearTicketeroUseCaseTest {

    @Test
    void crearTicketero(){
        var entradaId = new EntradaId("12");
        var empleadoId = new EmpleadoId("123");

        var command = new CrearTicketeroCommand(empleadoId,entradaId);

        var usecase = new CrearTicketeroUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        var event = (TicketeroCreado) events.get(0);

        Assertions.assertEquals("12",event.getEntradaId().value());
        Assertions.assertEquals("123", event.getEmpleadoId().value());
    }
}