package co.com.sofka.ventas.ticketero;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ventas.ticketero.values.EntradaId;
import co.com.sofka.ventas.ticketero.values.Ubicacion;
import co.com.sofka.ventas.values.Numero;
import co.com.sofka.ventas.vendedor.values.Disponible;

public class Entrada extends Entity<EntradaId> {

    private Disponible disponible;
    private Numero numero;
    private Ubicacion ubicacion;

    public Entrada(EntradaId entityId, Disponible disponible, Numero numero, Ubicacion ubicacion) {
        super(entityId);
        this.disponible = disponible;
        this.numero = numero;
        this.ubicacion = ubicacion;
    }

    public void cambiarDisponibilidad(Disponible disponible){
        this.disponible = disponible;
    }

    public void cambiarUbicacion(Ubicacion ubicacion){
        this.ubicacion = ubicacion;
    }

    public void cambiarNumero(Numero numero){
        this.numero = numero;
    }

    public Disponible disponible() {
        return disponible;
    }

    public Numero numero() {
        return numero;
    }

    public Ubicacion ubicacion() {
        return ubicacion;
    }
}
