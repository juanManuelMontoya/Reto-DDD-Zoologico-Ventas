package co.com.sofka.ventas.ticketero.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.ventas.empleado.values.EmpleadoId;

public class TicketeroId extends Identity {

    public TicketeroId(String id) {
        super(id);
    }

    public TicketeroId of (String id){
        return new TicketeroId(id);
    }
}
