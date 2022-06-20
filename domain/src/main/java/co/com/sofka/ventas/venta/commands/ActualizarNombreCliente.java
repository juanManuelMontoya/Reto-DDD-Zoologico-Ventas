package co.com.sofka.ventas.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ventas.general.values.Nombre;
import co.com.sofka.ventas.venta.values.ClienteId;
import co.com.sofka.ventas.venta.values.VentaId;

public class ActualizarNombreCliente extends Command {

    protected ClienteId clienteId;
    protected Nombre nombre;
    protected VentaId ventaId;

    public ActualizarNombreCliente(ClienteId clienteId, Nombre nombre, VentaId ventaId) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.ventaId = ventaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public VentaId getVentaId() {
        return ventaId;
    }
}
