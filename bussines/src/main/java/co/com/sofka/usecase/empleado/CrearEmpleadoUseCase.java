package co.com.sofka.usecase.empleado;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ventas.empleado.Empleado;
import co.com.sofka.ventas.empleado.commands.CrearEmpleado;
import co.com.sofka.ventas.empleado.values.EmpleadoId;

public class CrearEmpleadoUseCase extends UseCase<RequestCommand<CrearEmpleado>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearEmpleado> input) {
        var command = input.getCommand();

        var empleado = new Empleado(new EmpleadoId("123"),command.getNombre(),command.getCuentaId(),command.getIdentificacionId());

        emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));
    }
}
