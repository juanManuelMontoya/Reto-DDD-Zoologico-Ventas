package co.com.sofka.ventas.values;

import co.com.sofka.domain.generic.ValueObject;

import javax.print.Doc;
import java.util.Objects;

public class TipoDocumento implements ValueObject<TipoDocumento.Documento> {

    private final Documento documento;

    public TipoDocumento(Documento documento) {
        this.documento = Objects.requireNonNull(documento);
    }

    @Override
    public Documento value() {
        return documento;
    }

    public enum Documento {
        CEDULA, TARJETA_IDENTIDAD, SUPERCHAT
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoDocumento tipo = (TipoDocumento) o;
        return documento == tipo.documento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }
}
