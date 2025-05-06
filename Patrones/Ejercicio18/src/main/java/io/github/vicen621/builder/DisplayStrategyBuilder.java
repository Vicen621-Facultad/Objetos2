package io.github.vicen621.builder;

import io.github.vicen621.strategies.*;

public class DisplayStrategyBuilder implements Builder<DisplayStrategy> {
    private DisplayStrategy result;
    private static DisplayStrategyBuilder instance;

    private DisplayStrategyBuilder() {
        reset();
    }

    @Override
    public void reset() {
        result = new NullDisplayComponent();
    }

    @Override
    public Builder<DisplayStrategy> addCreacion() {
        result = new CreacionDisplayComponent(result);
        return this;
    }

    @Override
    public Builder<DisplayStrategy> addExtension() {
        result = new ExtensionDisplayComponent(result);
        return this;
    }

    @Override
    public Builder<DisplayStrategy> addModificacion() {
        result = new ModificacionDisplayComponent(result);
        return this;
    }

    @Override
    public Builder<DisplayStrategy> addNombre() {
        result = new NombreDisplayComponent(result);
        return this;
    }

    @Override
    public Builder<DisplayStrategy> addPermisos() {
        result = new PermisosDisplayComponent(result);
        return this;
    }

    @Override
    public Builder<DisplayStrategy> addTamanio() {
        result = new TamanioDisplayComponent(result);
        return this;
    }

    public DisplayStrategy getResult() {
        DisplayStrategy res = result;
        reset();
        return res;
    }

    // Singleton
    public static DisplayStrategyBuilder getInstance() {
        if (instance == null) {
            instance = new DisplayStrategyBuilder();
        }

        return instance;
    }
}
