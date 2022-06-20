package co.com.sofka.usecase.empleado;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ventas.empleado.Empleado;
import co.com.sofka.ventas.empleado.commands.CambiarNombre;
import co.com.sofka.ventas.empleado.values.CuentaId;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.general.values.IdentificacionId;
import co.com.sofka.ventas.general.values.Nombre;

public class CambiarNombreUseCase  extends UseCase<RequestCommand<CambiarNombre>,ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarNombre> input) {
        var command = input.getCommand();
        var empleado = new
                Empleado(command.getEmpleadoId(),new Nombre("Juan Manuel"), new CuentaId("123"), new IdentificacionId("123"));

        empleado.cambiarNombre(command.getNombre());

        emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));
    }
}
