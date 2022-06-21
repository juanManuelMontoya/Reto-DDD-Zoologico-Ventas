package co.com.sofka.usecase.empleado;

import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.usecase.EnviarEmailService;
import co.com.sofka.ventas.empleado.commands.CambiarNombreCommand;
import co.com.sofka.ventas.empleado.events.NombreCambiado;
import co.com.sofka.ventas.empleado.values.CuentaId;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.general.values.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class NotificarNombreCambiadoUseCaseTest {

    @Mock
    EnviarEmailService enviarEmailService;

    @InjectMocks
    NotificarNombreCambiadoUseCase useCase;

    @Test
    void notificarNombreCambiado(){

        var nombre = new Nombre("JuanM Montoya");

        var event = new NombreCambiado(CuentaId.of("juan123"),nombre);

        doNothing().when(enviarEmailService).sendEmail(any(),any());
        useCase.addServiceBuilder(new ServiceBuilder().addService(enviarEmailService));

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase,new TriggeredEvent<>(event))
                .orElseThrow().getDomainEvents();

        Mockito.verify(enviarEmailService).sendEmail(any(),any());
        Assertions.assertEquals(0, events.size());
    }
}