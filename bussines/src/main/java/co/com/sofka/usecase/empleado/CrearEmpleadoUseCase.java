package co.com.sofka.usecase.empleado;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ventas.empleado.Empleado;
import co.com.sofka.ventas.empleado.commands.CrearEmpleadoCommand;
import co.com.sofka.ventas.empleado.values.EmpleadoId;

public class CrearEmpleadoUseCase extends UseCase<RequestCommand<CrearEmpleadoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearEmpleadoCommand> input) {
        var command = input.getCommand();

        var empleado = new Empleado(new EmpleadoId("123"),command.getNombre(),command.getCuentaId(),command.getIdentificacionId());

        emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));
    }
}
