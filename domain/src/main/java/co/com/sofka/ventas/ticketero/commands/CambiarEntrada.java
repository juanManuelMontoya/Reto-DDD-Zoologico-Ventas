package co.com.sofka.ventas.ticketero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.ticketero.values.EntradaId;
import co.com.sofka.ventas.ticketero.values.TicketeroId;

public class CambiarEntrada extends Command {

    protected TicketeroId ticketeroId;
    protected EntradaId entradaId;

    public CambiarEntrada(TicketeroId ticketeroId, EntradaId entradaId) {
        this.ticketeroId = ticketeroId;
        this.entradaId = entradaId;
    }

    public TicketeroId getTicketeroId() {
        return ticketeroId;
    }

    public EntradaId getEntradaId() {
        return entradaId;
    }
}
