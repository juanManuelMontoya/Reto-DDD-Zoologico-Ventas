package co.com.sofka.usecase.vendedor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ventas.vendedor.commands.CambiarPuntoDeVentaCommand;
import co.com.sofka.ventas.vendedor.events.PuntoDeVentaCambiado;
import co.com.sofka.ventas.vendedor.values.PuntoDeVentaID;
import co.com.sofka.ventas.vendedor.values.VendedorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CambiarPuntoDeVentaUseCaseTest {

    @Test
    void cambiarPuntoDeVenta(){
        var puntoDeVentaId = new PuntoDeVentaID("2");
        var vendedorID = new VendedorId("145");

        var command = new CambiarPuntoDeVentaCommand(puntoDeVentaId,vendedorID);

        var usecase = new CambiarPuntoDeVentaUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        var event = (PuntoDeVentaCambiado) events.get(1);

        Assertions.assertEquals("2", event.getPuntoDeVentaID().value());
    }

}