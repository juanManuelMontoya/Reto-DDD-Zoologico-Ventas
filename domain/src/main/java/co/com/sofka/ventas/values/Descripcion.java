package co.com.sofka.ventas.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {

    private String descripcion;

    public Descripcion(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);
        if (this.descripcion.isBlank()){
            throw new IllegalArgumentException("La descripcion no puede estar en blanco");
        }
        if (this.descripcion.length() < 5){
            throw new IllegalArgumentException("La descripcion debe contener mas caracteres");
        }
    }

    @Override
    public String value() {
        return descripcion;
    }

    public static Descripcion newDescripcion(String descripcion){
        return new Descripcion(descripcion);
    }
}
