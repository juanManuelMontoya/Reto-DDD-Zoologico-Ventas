package co.com.sofka.ventas.empleado;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ventas.empleado.values.Contrasena;
import co.com.sofka.ventas.empleado.values.CuentaId;
import co.com.sofka.ventas.empleado.values.Email;
import co.com.sofka.ventas.empleado.values.NombreUsuario;

import java.util.Objects;

public class Cuenta extends Entity<CuentaId> {

    protected Email email;
    protected Contrasena contrasena;
    protected NombreUsuario nombreUsuario;

    public Cuenta(CuentaId entityId, Email email, Contrasena contrasena, NombreUsuario usuario) {
        super(entityId);
        this.email = email;
        this.contrasena = contrasena;
        this.nombreUsuario = usuario;
    }


    public void actualizarContraseña(Contrasena contrasena){
        this.contrasena = contrasena;
    }

    public void actualizarNombreUsuario (NombreUsuario nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }

    public Email email() {
        return email;
    }

    public Contrasena contrasena() {
        return contrasena;
    }

    public NombreUsuario nombreUsuario() {
        return nombreUsuario;
    }
}
