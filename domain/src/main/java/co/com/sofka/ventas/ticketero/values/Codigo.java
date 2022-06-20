package co.com.sofka.ventas.ticketero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Codigo implements ValueObject<String> {

    private String codigo;

    public Codigo(String codigo) {
        this.codigo = Objects.requireNonNull(codigo);
        if (this.codigo.isBlank()){
            throw new IllegalArgumentException("El campo codigo no puede estar en blanco");
        }
        if (this.codigo.length()<1){
            throw new IllegalArgumentException("EL CODIGO debe contener mas de un caracter");
        }
    }

    @Override
    public String value() {
        return codigo;
    }

    public static Codigo newCodigo(String codigo){
        return new Codigo(codigo);
    }
}
