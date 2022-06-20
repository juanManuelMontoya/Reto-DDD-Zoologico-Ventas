package co.com.sofka.ventas.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventas.empleado.values.EquipoDeComputoId;

public class EquipoDeComputoCambiado extends DomainEvent {

    private final EquipoDeComputoId equipoDeComputoId;
    public EquipoDeComputoCambiado(EquipoDeComputoId equipoDeComputoId) {
        super("co.sofka.ventas.equipodecomputocambiado");
        this.equipoDeComputoId = equipoDeComputoId;
    }

    public EquipoDeComputoId getEquipoDeComputoId() {
        return equipoDeComputoId;
    }
}
