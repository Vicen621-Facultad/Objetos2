package io.github.vicen621.strategies;

import io.github.vicen621.FileOO2;

public class PermisosDisplayComponent extends DisplayComponent {
    public PermisosDisplayComponent(DisplayStrategy inner) {
        super(inner);
    }

    @Override
    public String printComponent(FileOO2 file) {
        return file.getPermisos();
    }
}
