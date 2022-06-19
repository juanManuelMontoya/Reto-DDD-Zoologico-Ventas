package co.com.sofka.ventas.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Contrasena implements ValueObject<String> {

    private String contrasena;

    public Contrasena(String contrasena) {
        this.contrasena = Objects.requireNonNull(contrasena);
        if (this.contrasena.isBlank()){
            throw new IllegalArgumentException("El campo contraseña no puede ser vacio");
        }

        if (this.contrasena.length() < 8){
            throw new IllegalArgumentException("La contraseña no puede contener menos de 8 caracteres");
        }
    }

    @Override
    public String value() {
        return contrasena;
    }

    public static Contrasena newContrasena(String contrasena){
        return new Contrasena(contrasena);
    }
}
