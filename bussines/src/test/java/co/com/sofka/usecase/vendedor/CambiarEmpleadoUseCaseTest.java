package co.com.sofka.usecase.vendedor;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.usecase.ticketero.CambiarEntradaUseCase;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.vendedor.commands.CambiarEmpleado;
import co.com.sofka.ventas.vendedor.events.EmpleadoCambiado;
import co.com.sofka.ventas.vendedor.values.VendedorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CambiarEmpleadoUseCaseTest {

    @Test
    void cambiarEmpleado(){
        var empleadoId = new EmpleadoId("123");
        var vendedorId = new VendedorId("321");

        var command  = new CambiarEmpleado(empleadoId,vendedorId);

        var usecase = new CambiarEmpleadoUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        var event = (EmpleadoCambiado) events.get(1);

        Assertions.assertEquals("123", event.getEmpleadoId().value());
    }
}