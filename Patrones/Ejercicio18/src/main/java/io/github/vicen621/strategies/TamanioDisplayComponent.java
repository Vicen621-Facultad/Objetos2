package io.github.vicen621.strategies;

import io.github.vicen621.FileOO2;

public class TamanioDisplayComponent extends DisplayComponent {

    public TamanioDisplayComponent(DisplayStrategy inner) {
        super(inner);
    }

    @Override
    public String printComponent(FileOO2 file) {
        return file.getTamanio() + "";
    }
}
