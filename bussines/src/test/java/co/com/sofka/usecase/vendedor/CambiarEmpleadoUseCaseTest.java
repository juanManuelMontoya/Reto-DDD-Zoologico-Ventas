package co.com.sofka.usecase.vendedor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.vendedor.commands.CambiarEmpleadoCommand;
import co.com.sofka.ventas.vendedor.events.EmpleadoCambiado;
import co.com.sofka.ventas.vendedor.values.VendedorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CambiarEmpleadoUseCaseTest {

    @Test
    void cambiarEmpleado(){
        var empleadoId = new EmpleadoId("123");
        var vendedorId = new VendedorId("321");

        var command  = new CambiarEmpleadoCommand(empleadoId,vendedorId);

        var usecase = new CambiarEmpleadoUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        var event = (EmpleadoCambiado) events.get(1);

        Assertions.assertEquals("123", event.getEmpleadoId().value());
    }
}