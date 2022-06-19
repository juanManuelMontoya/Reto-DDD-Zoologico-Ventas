package co.com.sofka.ventas.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreUsuario implements ValueObject<String> {

    private String nombreUsuario;

    public NombreUsuario(String nombreUsuario) {
        this.nombreUsuario = Objects.requireNonNull(nombreUsuario);

        if (this.nombreUsuario.isBlank()){
            throw new IllegalArgumentException("El campo usuario no puede estar vacio");
        }

        if (this.nombreUsuario.length() < 2){
            throw new IllegalArgumentException("EL nombre de usuario no puede contener menos de 2 caracteres");
        }
    }

    @Override
    public String value() {
        return this.nombreUsuario;
    }

    public static NombreUsuario newUsuario(String nombreUsuario){
        return new NombreUsuario(nombreUsuario);
    }
}
