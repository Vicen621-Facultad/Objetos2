package io.github.vicen621.strategies;

import io.github.vicen621.FileOO2;

public class NombreDisplayComponent extends DisplayComponent{
    public NombreDisplayComponent(DisplayStrategy inner) {
        super(inner);
    }

    @Override
    public String printComponent(FileOO2 file) {
        return file.getNombre();
    }
}
