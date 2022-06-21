package co.com.sofka.usecase.vendedor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ventas.empleado.values.EquipoDeComputoId;
import co.com.sofka.ventas.vendedor.commands.CambiarEquipoDeComputo;
import co.com.sofka.ventas.vendedor.events.EquipoDeComputoCambiado;
import co.com.sofka.ventas.vendedor.values.VendedorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CambiarEquipoDeComputoUseCaseTest {

    @Test
    void cambiarEquipoDeComputo(){

        var computoId = new EquipoDeComputoId("321");
        var vendedorID = new VendedorId("145");

        var command = new CambiarEquipoDeComputo(computoId,vendedorID);

        var usecase = new CambiarEquipoDeComputoUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (EquipoDeComputoCambiado) events.get(1);

        Assertions.assertEquals("321", event.getEquipoDeComputoId().value());
    }


}