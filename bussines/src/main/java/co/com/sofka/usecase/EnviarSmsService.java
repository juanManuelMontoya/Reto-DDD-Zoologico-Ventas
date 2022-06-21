package co.com.sofka.usecase;

import co.com.sofka.ventas.venta.values.NumeroTelefono;

public interface EnviarSmsService {

    void enviarSMS(NumeroTelefono numeroTelefono, String body);
}
