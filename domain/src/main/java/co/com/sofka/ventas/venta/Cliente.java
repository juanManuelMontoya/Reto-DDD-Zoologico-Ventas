package co.com.sofka.ventas.venta;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ventas.general.values.IdentificacionId;
import co.com.sofka.ventas.general.values.Nombre;
import co.com.sofka.ventas.venta.values.ClienteId;

public class Cliente extends Entity<ClienteId> {

    protected Nombre nombre;
    protected IdentificacionId identificacionId;

    public Cliente(ClienteId clienteId, Nombre nombre, IdentificacionId identificacionId) {
        super(clienteId);
        this.nombre = nombre;
        this.identificacionId = identificacionId;
    }

    public void cambiarNombre (Nombre nombre){
        this.nombre = nombre;
    }

    public Nombre nombre() {
        return nombre;
    }

    public IdentificacionId identificacionId() {
        return identificacionId;
    }
}
