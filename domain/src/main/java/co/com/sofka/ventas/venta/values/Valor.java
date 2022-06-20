package co.com.sofka.ventas.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Valor implements ValueObject<Float> {

    private Float valor;

    public Valor(Float valor) {
        this.valor = Objects.requireNonNull(valor);
        if (this.valor < 1){
            throw new IllegalArgumentException("El valor ingresado no es valido.");
        }
    }

    @Override
    public Float value() {
        return valor;
    }

    public static Valor newValor(Float valor){
        return new Valor(valor);
    }
}
