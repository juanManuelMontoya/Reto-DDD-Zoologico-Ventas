package co.com.sofka.ventas.vendedor;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ventas.vendedor.values.Disponible;
import co.com.sofka.ventas.vendedor.values.Horario;
import co.com.sofka.ventas.vendedor.values.PuntoDeVentaID;
import co.com.sofka.ventas.general.values.Numero;

import java.util.Objects;

public class PuntoDeVenta extends Entity<PuntoDeVentaID> {

    protected Numero numero;
    protected Horario horario;
    protected Disponible disponible;

    public PuntoDeVenta(PuntoDeVentaID entityId,Numero numero, Horario horario, Disponible disponible) {
        super(entityId);
        this.numero = numero;
        this.horario = horario;
        this.disponible = disponible;
    }

    public void cambiarNumero(Numero numero){
        this.numero = Objects.requireNonNull(numero);
    }

    public void actualizarDisponibilidad(Disponible disponible){
        this.disponible = Objects.requireNonNull(disponible);
    }

    public void actualizarHorario(Horario horario){
        this.horario = Objects.requireNonNull(horario);
    }

    public Numero numero() {
        return numero;
    }

    public Horario horario() {
        return horario;
    }

    public Disponible disponible() {
        return disponible;
    }
}
