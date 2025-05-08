package io.github.vicen621.decorators;

import java.time.format.DateTimeFormatter;

public class ModificacionDecorator extends AbstractDecorator {
    public ModificacionDecorator(IFile inner) {
        super(inner);
    }

    @Override
    public String printComponent() {
        return getModificacion().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
