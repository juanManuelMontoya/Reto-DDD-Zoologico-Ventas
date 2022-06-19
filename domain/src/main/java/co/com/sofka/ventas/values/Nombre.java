package co.com.sofka.ventas.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String nombre;

    public Nombre(String nombre) {
        this.nombre = Objects.requireNonNull(nombre);
        if (this.nombre.isBlank()){
            throw new IllegalArgumentException("El campo nombre no puede ser vacio");
        }
    }

    @Override
    public String value() {
        return nombre;
    }

    public static Nombre newNombre(String nombre) {
        return new Nombre(nombre);
    }
}