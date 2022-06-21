package co.com.sofka.ventas.ticketero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.ticketero.values.EntradaId;

public class CrearTicketeroCommand extends Command {

    protected EmpleadoId empleadoId;
    protected EntradaId entradaId;

    public CrearTicketeroCommand(EmpleadoId empleadoId, EntradaId entradaId) {
        this.empleadoId = empleadoId;
        this.entradaId = entradaId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public EntradaId getEntradaId() {
        return entradaId;
    }
}
