package co.com.sofka.ventas.venta;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ventas.general.values.IdentificacionId;
import co.com.sofka.ventas.general.values.Nombre;
import co.com.sofka.ventas.venta.values.ClienteId;
import co.com.sofka.ventas.venta.values.NumeroTelefono;

public class Cliente extends Entity<ClienteId> {

    protected Nombre nombre;
    protected IdentificacionId identificacionId;

    protected NumeroTelefono numeroTelefono;

    public Cliente(ClienteId clienteId, Nombre nombre, IdentificacionId identificacionId, NumeroTelefono numeroTelefono) {
        super(clienteId);
        this.nombre = nombre;
        this.identificacionId = identificacionId;
        this.numeroTelefono = numeroTelefono;
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

    public NumeroTelefono numeroTelefono() {
        return numeroTelefono;
    }
}
