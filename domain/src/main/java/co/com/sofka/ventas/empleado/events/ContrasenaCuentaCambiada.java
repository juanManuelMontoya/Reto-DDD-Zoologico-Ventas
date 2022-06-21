package co.com.sofka.ventas.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.empleado.values.Contrasena;
import co.com.sofka.ventas.empleado.values.CuentaId;
import co.com.sofka.ventas.empleado.values.Email;

public class ContrasenaCuentaCambiada extends DomainEvent {

    private final CuentaId cuentaId;
    private final Contrasena contrasena;
    public ContrasenaCuentaCambiada(CuentaId cuentaId, Contrasena contrasena) {
        super("co.sofka.ventas.contrasenacuentacambiada");
        this.contrasena = contrasena;
        this.cuentaId = cuentaId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Contrasena getContrasena() {
        return contrasena;
    }
}
