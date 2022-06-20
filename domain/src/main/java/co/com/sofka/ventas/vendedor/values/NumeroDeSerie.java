package co.com.sofka.ventas.vendedor.values;

import co.com.sofka.domain.generic.ValueObject;

public class NumeroDeSerie implements ValueObject<String> {

    private String numeroDeSerie;

    public NumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    @Override
    public String value() {
        return numeroDeSerie;
    }

    public static NumeroDeSerie newNumeroDeSerie(String numeroDeSerie){
        return new NumeroDeSerie(numeroDeSerie);
    }
}
