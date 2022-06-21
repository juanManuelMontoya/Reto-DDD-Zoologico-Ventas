package co.com.sofka.ventas.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.general.values.IdentificacionId;
import co.com.sofka.ventas.general.values.Nombre;
import co.com.sofka.ventas.venta.Cliente;
import co.com.sofka.ventas.venta.values.ClienteId;

public class NombreClienteActualizado extends DomainEvent {

    private final ClienteId clienteId;
    private final Nombre nombre;

    public NombreClienteActualizado(ClienteId clienteId, Nombre nombre) {
        super("co.sofka.ventas.nombreclienteactualizado");
        this.clienteId = clienteId;
        this.nombre = nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
