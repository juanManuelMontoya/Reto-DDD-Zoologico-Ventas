package co.com.sofka.ventas.Vendedor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Map;

public class Horario implements ValueObject<String> {

    private String horario;

    public Horario(String horario) {
        this.horario = horario;
    }

    @Override
    public String value() {
        return horario;
    }

    public static Horario newHorario(String horario){
        return new Horario(horario);
    }
}
