package co.com.sofka.ventas.vendedor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.ventas.vendedor.events.EmpleadoCambiado;
import co.com.sofka.ventas.vendedor.events.EquipoDeComputoCambiado;
import co.com.sofka.ventas.vendedor.events.PuntoDeVentaCambiado;
import co.com.sofka.ventas.vendedor.events.VendedorCreado;
import co.com.sofka.ventas.vendedor.values.PuntoDeVentaID;
import co.com.sofka.ventas.vendedor.values.VendedorId;
import co.com.sofka.ventas.empleado.values.EmpleadoId;
import co.com.sofka.ventas.empleado.values.EquipoDeComputoId;

public class Vendedor extends AggregateEvent<VendedorId> {

    protected PuntoDeVentaID puntoDeVentaId;
    protected EquipoDeComputoId equipoDeComputoId;
    protected EmpleadoId empleadoId;

    public Vendedor(VendedorId entityId, PuntoDeVentaID puntoDeVentaId, EquipoDeComputoId equipoDeComputoId, EmpleadoId empleadoId) {
        super(entityId);
        appendChange(new VendedorCreado(puntoDeVentaId,equipoDeComputoId,empleadoId)).apply();
    }

    private Vendedor(VendedorId entityId){
        super(entityId);
        subscribe(new VendedorChange(this));
    }

    public void cambiarEquipoDeComputo(EquipoDeComputoId equipoDeComputoId){
        appendChange(new EquipoDeComputoCambiado(equipoDeComputoId)).apply();
    }

    public void cambiarPuntoDeVenta(PuntoDeVentaID puntoDeVentaID){
        appendChange(new PuntoDeVentaCambiado(puntoDeVentaID)).apply();
    }

    public void cambiarEmpleado(EmpleadoId empleadoId){
        appendChange(new EmpleadoCambiado(empleadoId)).apply();
    }

    public PuntoDeVentaID puntoDeVentaId() {
        return puntoDeVentaId;
    }

    public EquipoDeComputoId equipoDeComputoId() {
        return equipoDeComputoId;
    }

    public EmpleadoId empleadoId() {
        return empleadoId;
    }
}
