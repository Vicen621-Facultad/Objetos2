package io.github.vicen621.directors;

import io.github.vicen621.Catalogo;
import io.github.vicen621.builders.Builder;

public abstract class Director {
    private Catalogo catalogo;

    public Director(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public abstract void buildPC(Builder builder);
}
