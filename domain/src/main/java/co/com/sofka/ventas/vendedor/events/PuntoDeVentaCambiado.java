package co.com.sofka.ventas.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.vendedor.values.PuntoDeVentaID;

public class PuntoDeVentaCambiado extends DomainEvent {

    private final PuntoDeVentaID puntoDeVentaID;
    public PuntoDeVentaCambiado(PuntoDeVentaID puntoDeVentaID) {
        super("co.sofka.ventas.puntodeventacambiado");
        this.puntoDeVentaID = puntoDeVentaID;
    }

    public PuntoDeVentaID getPuntoDeVentaID() {
        return puntoDeVentaID;
    }
}
