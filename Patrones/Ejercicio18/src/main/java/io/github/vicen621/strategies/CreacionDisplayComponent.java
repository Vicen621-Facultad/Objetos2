package io.github.vicen621.strategies;

import io.github.vicen621.FileOO2;

import java.time.format.DateTimeFormatter;

public class CreacionDisplayComponent extends DisplayComponent {
    public CreacionDisplayComponent(DisplayStrategy inner) {
        super(inner);
    }

    @Override
    public String printComponent(FileOO2 file) {
        return file.getCreacion().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
