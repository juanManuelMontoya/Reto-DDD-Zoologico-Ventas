package co.com.sofka.usecase.vendedor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.empleado.values.EquipoDeComputoId;
import co.com.sofka.ventas.vendedor.commands.CrearVendedor;
import co.com.sofka.ventas.vendedor.events.VendedorCreado;
import co.com.sofka.ventas.vendedor.values.PuntoDeVentaID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearVendedorUseCaseTest {

    @Test
    void crearVendedor(){
        var puntoDeVentaID = new PuntoDeVentaID("132");
        var empleadoId = new EmpleadoId("1193");
        var equipoDeComputo = new EquipoDeComputoId("ab23");

        var command = new CrearVendedor(puntoDeVentaID,equipoDeComputo,empleadoId);

        var usecase = new CrearVendedorUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        var event = (VendedorCreado) events.get(0);

        Assertions.assertEquals("132", event.getPuntoDeVentaID().value());
        Assertions.assertEquals("1193", event.getEmpleadoId().value());
        Assertions.assertEquals("ab23", event.getEquipoDeComputoId().value());
    }

}