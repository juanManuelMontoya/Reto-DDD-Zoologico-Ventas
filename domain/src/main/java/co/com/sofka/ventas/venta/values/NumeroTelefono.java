package co.com.sofka.ventas.venta.values;

import co.com.sofka.domain.generic.ValueObject;

public class NumeroTelefono implements ValueObject<String> {

    private String numerotelefono;

    public NumeroTelefono(String numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    @Override
    public String value() {
        return numerotelefono;
    }

    public static NumeroTelefono newNumeroTelefono(String numerotelefono){
        return new NumeroTelefono(numerotelefono);
    }
}
