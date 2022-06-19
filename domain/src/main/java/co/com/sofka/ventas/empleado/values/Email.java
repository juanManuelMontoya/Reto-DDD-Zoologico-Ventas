package co.com.sofka.ventas.empleado.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.ventas.values.Nombre;

import java.util.Objects;

public class Email implements ValueObject<String> {

    private String email;

    public Email(String email) {
        this.email = Objects.requireNonNull(email);
        if (this.email.isBlank()){
            throw new IllegalArgumentException("El campo email no puede ser vacio");
        }
        if (this.email.length() < 11){
            throw new IllegalArgumentException("El campo email no puede contener menos 11 caracteres");
        }
    }

    @Override
    public String value() {
        return email;
    }

    public static Email newEmail(String email) {
        return new Email(email);
    }
}
