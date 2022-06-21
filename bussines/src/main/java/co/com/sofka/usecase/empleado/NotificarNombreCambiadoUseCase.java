package co.com.sofka.usecase.empleado;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.usecase.EnviarEmailService;
import co.com.sofka.ventas.empleado.events.NombreCambiado;

import java.util.List;

public class NotificarNombreCambiadoUseCase extends UseCase<TriggeredEvent<NombreCambiado>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<NombreCambiado> input) {
        var event = input.getDomainEvent();

        var service = getService(EnviarEmailService.class).orElseThrow();

        service.sendEmail(event.getCuentaId(), "El nombre se modifico con exito");

        emit().onResponse(new ResponseEvents(List.of()));
    }
}
