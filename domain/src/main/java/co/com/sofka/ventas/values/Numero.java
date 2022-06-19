package co.com.sofka.ventas.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Numero implements ValueObject<String> {

    private int numero;

    public Numero(int numero) {
        this.numero = Objects.requireNonNull(numero);

        if (this.numero < 1){
            throw new IllegalArgumentException("EL numero de documento es invalido");
        }
    }

    @Override
    public String value() {
        return null;
    }

    public static Numero newNumero(int numero){
        return new Numero(numero);
    }
}
