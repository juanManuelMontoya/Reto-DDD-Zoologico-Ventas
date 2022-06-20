package co.com.sofka.ventas.vendedor.values;

import co.com.sofka.domain.generic.ValueObject;

public class Disponible implements ValueObject<Boolean> {

    private Boolean disponibilidad;

    public Disponible(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public Boolean value() {
        return disponibilidad;
    }

    public static Disponible newDisponible(Boolean disponibilidad){
        return new Disponible(disponibilidad);
    }
}
