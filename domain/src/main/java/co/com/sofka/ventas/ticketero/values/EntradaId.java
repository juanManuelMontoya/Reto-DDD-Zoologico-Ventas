package co.com.sofka.ventas.ticketero.values;

import co.com.sofka.domain.generic.Identity;

public class EntradaId extends Identity {
    public EntradaId(String id) {
        super(id);
    }

    public EntradaId of (String id){
        return new EntradaId(id);
    }
}
