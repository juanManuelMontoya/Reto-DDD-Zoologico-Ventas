package co.com.sofka.usecase.empleado;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ventas.empleado.commands.CambiarNombreCommand;
import co.com.sofka.ventas.empleado.events.NombreCambiado;
import co.com.sofka.ventas.empleado.values.CuentaId;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.general.values.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CambiarNombreUseCaseTest {

    @Test
    void cambiarNombre(){

        //Add
        var id = new EmpleadoId("123");
        var nombre = new Nombre("julian");
        var cuentaId = new CuentaId("142");

        var command = new CambiarNombreCommand(cuentaId,nombre,id);

        var useCase = new CambiarNombreUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (NombreCambiado) events.get(1);

        Assertions.assertEquals("julian", event.getNombre().value());
    }

}