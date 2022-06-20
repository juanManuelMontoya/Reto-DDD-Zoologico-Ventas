package co.com.sofka.ventas.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.general.values.Nombre;

public class NombreCambiado extends DomainEvent {

    private final Nombre nombre;
    public NombreCambiado(Nombre nombre) {
        super("co.sofka.ventas.nombreCreado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
