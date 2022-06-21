package co.com.sofka.usecase;

import co.com.sofka.ventas.empleado.values.CuentaId;

public interface EnviarEmailService {
    void sendEmail(CuentaId cuentaId, String mensaje);
}
