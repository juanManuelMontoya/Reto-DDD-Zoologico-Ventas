package co.com.sofka.ventas.ticketero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Color implements ValueObject<String> {

    private String color;

    public Color(String color) {
        this.color = Objects.requireNonNull(color);
        if (this.color.isBlank()){
            throw new IllegalArgumentException("El campo color no puede estar en blanco");
        }
    }

    @Override
    public String value() {
        return color;
    }

    public static Color newColor(String color){
        return new Color(color);
    }
}
