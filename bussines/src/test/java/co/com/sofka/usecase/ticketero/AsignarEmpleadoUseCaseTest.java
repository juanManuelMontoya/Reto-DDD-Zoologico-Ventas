package co.com.sofka.usecase.ticketero;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ventas.empleado.Empleado;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.ticketero.commands.AsignarEmpleado;
import co.com.sofka.ventas.ticketero.events.EmpleadoAsignado;
import co.com.sofka.ventas.ticketero.values.TicketeroId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsignarEmpleadoUseCaseTest {

    @Test
    void AsignarEmpleado(){
        var empleadoId = new EmpleadoId("435");
        var ticketeroId = new TicketeroId("12");

        var command  = new AsignarEmpleado(ticketeroId,empleadoId);

        var useCase = new AsignarEmpleadoUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        var event = (EmpleadoAsignado) events.get(1);

        Assertions.assertEquals("435",event.getEmpleadoId().value());
    }

}