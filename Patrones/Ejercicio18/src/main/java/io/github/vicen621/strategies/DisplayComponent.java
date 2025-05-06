package io.github.vicen621.strategies;

import io.github.vicen621.FileOO2;

public abstract class DisplayComponent implements DisplayStrategy {
    protected DisplayStrategy inner;
    protected final char SEPARATOR = '-';

    public DisplayComponent(DisplayStrategy inner) {
        this.inner = inner;
    }

    @Override
    public String prettyPrint(FileOO2 file) {
        String currentComponent = printComponent(file);
        String innerComponent = inner.prettyPrint(file);

        if (currentComponent.isEmpty())
            return innerComponent;

        if (innerComponent.isEmpty())
            return currentComponent;

        return currentComponent + " " + SEPARATOR + " " + innerComponent;
    }

    public abstract String printComponent(FileOO2 file);
}
