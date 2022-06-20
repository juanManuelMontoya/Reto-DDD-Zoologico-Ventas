package co.com.sofka.ventas.ticketero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.ticketero.values.EntradaId;

public class EntradaCambiada extends DomainEvent {

    private final EntradaId entradaId;
    public EntradaCambiada(EntradaId entradaId) {
        super("co.sofka.ventas.entradacambiada");
        this.entradaId = entradaId;
    }

    public EntradaId getEntradaId() {
        return entradaId;
    }
}
