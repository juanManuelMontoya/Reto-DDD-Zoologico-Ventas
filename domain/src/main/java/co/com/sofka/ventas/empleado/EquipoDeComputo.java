package co.com.sofka.ventas.empleado;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ventas.Vendedor.values.NumeroDeSerie;
import co.com.sofka.ventas.empleado.values.EquipoDeComputoId;
import co.com.sofka.ventas.values.Descripcion;
import co.com.sofka.ventas.values.Numero;

public class EquipoDeComputo extends Entity<EquipoDeComputoId> {

    protected Descripcion descripcion;
    protected NumeroDeSerie numeroDeSerie;

    public EquipoDeComputo(EquipoDeComputoId entityId, Descripcion descripcion, NumeroDeSerie numeroDeSerie) {
        super(entityId);
        this.descripcion = descripcion;
        this.numeroDeSerie = numeroDeSerie;
    }


    public void cambiarDescripcion(Descripcion  descripcion){
        this.descripcion = descripcion;
    }

    public void cambiarNumeroDeSerie(NumeroDeSerie numeroDeSerie){
        this.numeroDeSerie = numeroDeSerie;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public NumeroDeSerie numeroDeSerie() {
        return numeroDeSerie;
    }
}
