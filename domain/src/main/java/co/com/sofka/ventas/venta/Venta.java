package co.com.sofka.ventas.venta;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.vendedor.values.VendedorId;
import co.com.sofka.ventas.venta.events.PlanCambiado;
import co.com.sofka.ventas.venta.events.VentaCreada;
import co.com.sofka.ventas.venta.values.ClienteId;
import co.com.sofka.ventas.venta.values.PlanId;
import co.com.sofka.ventas.venta.values.VentaId;

import java.util.List;

public class Venta extends AggregateEvent<VentaId> {

    protected VendedorId  vendedorId;
    protected ClienteId clienteId;
    protected PlanId planId;

    public Venta(VentaId entityId, VendedorId vendedorId, ClienteId clienteId, PlanId planId) {
        super(entityId);
        appendChange(new VentaCreada(vendedorId,clienteId,planId)).apply();
    }

    private Venta(VentaId entityId){
        super(entityId);
        subscribe(new VentaChange(this));
    }

    public static Venta from(VentaId ventaId, List<DomainEvent> events){
        var venta = new Venta(ventaId);
        events.forEach(venta::applyEvent);
        return venta;
    }

    /*public void actualizarNombreDeCLiente(ClienteId clienteId, Nombre nombre){
        appendChange(new NombreClienteActualizado(clienteId,nombre)).apply();
    }

    public void actualizarNombreDeEmpleado(EmpleadoId empleadoId, Nombre nombre){
        appendChange(new NombreEmpleadoActualizado(empleadoId,nombre)).apply();
    }*/

    public void cambiarPlan(PlanId planId){
        appendChange(new PlanCambiado(planId)).apply();
    }

    public VendedorId vendedorId() {
        return vendedorId;
    }

    public ClienteId clienteId() {
        return clienteId;
    }

    public PlanId planId() {
        return planId;
    }
}
