package co.com.sofka.usecase.empleado;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.usecase.EnviarEmailService;
import co.com.sofka.ventas.empleado.events.ContrasenaCuentaCambiada;

import java.util.List;

public class NotificarCuentaUseCase extends UseCase<TriggeredEvent<ContrasenaCuentaCambiada>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<ContrasenaCuentaCambiada> input) {
        var event = input.getDomainEvent();
        var service = getService(EnviarEmailService.class).orElseThrow();

        service.sendEmail(event.getCuentaId(), "La contraseña de su cuenta fue cambiada con exito");

        emit().onResponse(new ResponseEvents(List.of()));
    }
}
