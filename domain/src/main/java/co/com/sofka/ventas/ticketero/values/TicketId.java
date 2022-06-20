package co.com.sofka.ventas.ticketero.values;

import co.com.sofka.domain.generic.Identity;

public class TicketId extends Identity {
    public TicketId(String id) {
        super(id);
    }

    public TicketId of (String id){
        return new TicketId(id);
    }
}
