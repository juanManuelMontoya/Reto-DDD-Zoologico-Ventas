package co.com.sofka.ventas.venta;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ventas.general.values.Descripcion;
import co.com.sofka.ventas.general.values.Nombre;
import co.com.sofka.ventas.venta.values.PlanId;
import co.com.sofka.ventas.venta.values.Valor;

public class Plan extends Entity<PlanId> {

    protected Nombre nombre;
    protected Valor valor;
    protected Descripcion descripcion;

    public Plan(PlanId entityId, Nombre nombre, Valor valor, Descripcion descripcion) {
        super(entityId);
        this.nombre = nombre;
        this.valor = valor;
        this.descripcion = descripcion;
    }


    public void cambiarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void actualizarValor(Valor valor){
        this.valor = valor;
    }

    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion = descripcion;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Valor valor() {
        return valor;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
