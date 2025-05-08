package io.github.vicen621.decorators;

import java.time.format.DateTimeFormatter;

public class CreacionDecorator extends AbstractDecorator {
    public CreacionDecorator(IFile inner) {
        super(inner);
    }

    @Override
    public String printComponent() {
        return getCreacion().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
