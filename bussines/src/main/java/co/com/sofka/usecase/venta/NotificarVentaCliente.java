package co.com.sofka.usecase.venta;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.usecase.EnviarSmsService;
import co.com.sofka.ventas.general.values.IdentificacionId;
import co.com.sofka.ventas.general.values.Nombre;
import co.com.sofka.ventas.venta.Cliente;
import co.com.sofka.ventas.venta.events.VentaCreada;
import co.com.sofka.ventas.venta.values.NumeroTelefono;

import java.util.List;

public class NotificarVentaCliente extends UseCase<TriggeredEvent<VentaCreada>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<VentaCreada> input) {
        var event = input.getDomainEvent();

        var service = getService(EnviarSmsService.class).orElseThrow();
        var cliente = new Cliente(event.getClienteId(),new Nombre("juan"), new IdentificacionId("1193"),new NumeroTelefono("3015571243"));

        service.enviarSMS(cliente.numeroTelefono(),"Uste  a comprado el plan con exito");

        emit().onResponse(new ResponseEvents(List.of()));
    }
}
