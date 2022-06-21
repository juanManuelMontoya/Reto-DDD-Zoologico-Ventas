package co.com.sofka.usecase.venta;

import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.usecase.EnviarSmsService;
import co.com.sofka.usecase.empleado.NotificarNombreCambiadoUseCase;
import co.com.sofka.ventas.vendedor.values.VendedorId;
import co.com.sofka.ventas.venta.Cliente;
import co.com.sofka.ventas.venta.events.VentaCreada;
import co.com.sofka.ventas.venta.values.ClienteId;
import co.com.sofka.ventas.venta.values.PlanId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;

@ExtendWith(MockitoExtension.class)
class NotificarVentaClienteTest {

    @Mock
    EnviarSmsService enviarSmsService;

    @InjectMocks
    NotificarVentaCliente useCase;

    @Test
    void notificarClienteVenta(){
        var vendedorId = new VendedorId("147998");
        var clienteId = new ClienteId("1193");
        var planID = new PlanId("1");

        var event = new VentaCreada(vendedorId,clienteId,planID);

        doNothing().when(enviarSmsService).enviarSMS(any(),any());
        useCase.addServiceBuilder(new ServiceBuilder().addService(enviarSmsService));

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase,new TriggeredEvent<>(event))
                .orElseThrow().getDomainEvents();

        Mockito.verify(enviarSmsService).enviarSMS(any(),any());
        Assertions.assertEquals(0, events.size());
    }
}