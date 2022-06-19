package co.com.sofka.ventas.Vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.Vendedor.values.PuntoDeVentaID;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.empleado.values.EquipoDeComputoId;

public class VendedorCreado extends DomainEvent {

    private final PuntoDeVentaID puntoDeVentaID;
    private final  EquipoDeComputoId equipoDeComputoId;
    private final EmpleadoId empleadoId;
    public VendedorCreado(PuntoDeVentaID puntoDeVentaId, EquipoDeComputoId equipoDeComputoId, EmpleadoId empleadoId) {
        super("com.sofka.ventas.vendedorcreado");
        this.puntoDeVentaID = puntoDeVentaId;
        this.equipoDeComputoId = equipoDeComputoId;
        this.empleadoId = empleadoId;
    }

    public PuntoDeVentaID getPuntoDeVentaID() {
        return puntoDeVentaID;
    }

    public EquipoDeComputoId getEquipoDeComputoId() {
        return equipoDeComputoId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
