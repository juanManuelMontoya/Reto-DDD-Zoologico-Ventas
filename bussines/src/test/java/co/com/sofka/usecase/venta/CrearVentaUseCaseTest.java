package co.com.sofka.usecase.venta;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ventas.vendedor.values.VendedorId;
import co.com.sofka.ventas.venta.commands.CrearVenta;
import co.com.sofka.ventas.venta.events.VentaCreada;
import co.com.sofka.ventas.venta.values.ClienteId;
import co.com.sofka.ventas.venta.values.PlanId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearVentaUseCaseTest {

    @Test
    void crearVenta(){
        var clienteId = new ClienteId("1193");
        var planId = new PlanId("1");
        var vendedorId = new VendedorId("147998");

        var command = new CrearVenta(vendedorId,clienteId,planId);

        var usecase = new CrearVentaUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        var event = (VentaCreada) events.get(0);

        Assertions.assertEquals("1193",event.getClienteId().value());
        Assertions.assertEquals("1",event.getPlanId().value());
        Assertions.assertEquals("147998", event.getVendedorId().value());
    }

}