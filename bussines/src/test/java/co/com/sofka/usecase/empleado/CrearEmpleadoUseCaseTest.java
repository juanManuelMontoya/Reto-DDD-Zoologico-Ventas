package co.com.sofka.usecase.empleado;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ventas.empleado.commands.CrearEmpleado;
import co.com.sofka.ventas.empleado.events.EmpleadoCreado;
import co.com.sofka.ventas.empleado.values.CuentaId;
import co.com.sofka.ventas.general.values.IdentificacionId;
import co.com.sofka.ventas.general.values.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearEmpleadoUseCaseTest {

    @Test
    void crearEmpleado(){
        var nombre = new Nombre("Juan manuel");
        var cuentaId = new CuentaId("cuenta1");
        var identificacionId = new IdentificacionId("123");

        var command = new CrearEmpleado(nombre,cuentaId,identificacionId);

        var useCase = new CrearEmpleadoUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (EmpleadoCreado) events.get(0);

        Assertions.assertEquals("Juan manuel", event.getNombre().value());
        Assertions.assertEquals("cuenta1", event.getCuentaId().value());
        Assertions.assertEquals("123", event.getIdentificacionId().value());
    }
}