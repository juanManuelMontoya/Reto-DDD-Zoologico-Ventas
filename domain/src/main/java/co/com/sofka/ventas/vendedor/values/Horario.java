package co.com.sofka.ventas.vendedor.values;

import co.com.sofka.domain.generic.ValueObject;

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
