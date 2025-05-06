package io.github.vicen621.strategies;

import io.github.vicen621.FileOO2;

public class NullDisplayComponent extends DisplayComponent {
    public NullDisplayComponent() {
        super((file) -> "");
    }

    @Override
    public String printComponent(FileOO2 file) {
        return "";
    }
}
