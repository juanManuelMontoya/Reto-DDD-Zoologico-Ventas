package co.com.sofka.ventas.ticketero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.ticketero.values.TicketeroId;

public class AsignarEmpleadoCommand extends Command {

    protected TicketeroId ticketeroId;
    protected EmpleadoId empleadoId;

    public AsignarEmpleadoCommand(TicketeroId ticketeroId, EmpleadoId empleadoId) {
        this.ticketeroId = ticketeroId;
        this.empleadoId = empleadoId;
    }

    public TicketeroId getTicketeroId() {
        return ticketeroId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
