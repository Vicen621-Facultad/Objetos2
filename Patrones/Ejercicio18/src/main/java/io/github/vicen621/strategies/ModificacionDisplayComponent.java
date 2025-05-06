package io.github.vicen621.strategies;

import io.github.vicen621.FileOO2;

import java.time.format.DateTimeFormatter;

public class ModificacionDisplayComponent extends DisplayComponent {
    public ModificacionDisplayComponent(DisplayStrategy inner) {
        super(inner);
    }

    @Override
    public String printComponent(FileOO2 file) {
        return file.getModificacion().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
