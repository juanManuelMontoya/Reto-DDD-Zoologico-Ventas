package co.com.sofka.ventas;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ventas.values.IdentificacionId;
import co.com.sofka.ventas.values.Numero;
import co.com.sofka.ventas.values.TipoDocumento;

public class Identificacion  extends Entity<IdentificacionId> {

    protected Numero numero;
    protected TipoDocumento tipoDocumento;

    public Identificacion(IdentificacionId entityId, Numero numero, TipoDocumento tipoDocumento) {
        super(entityId);
        this.numero = numero;
        this.tipoDocumento = tipoDocumento;
    }

    public void cambiarNuemero(Numero numero){
        this.numero = numero;
    }

    public void cambiarTipoDocumento(TipoDocumento documento){
        this.tipoDocumento = documento;
    }

    public Numero numero() {
        return numero;
    }

    public TipoDocumento tipoDocumento() {
        return tipoDocumento;
    }
}
