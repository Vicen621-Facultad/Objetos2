package io.github.vicen621.directors;

import io.github.vicen621.Catalogo;
import io.github.vicen621.builders.Builder;

public class BasicDirector extends Director {

    public BasicDirector(Catalogo catalogo) {
        super(catalogo);
    }

    @Override
    public void buildPC(Builder builder) {
        builder.setProcesador(getCatalogo().getComponente("Procesador Basico"));
        builder.setRam(getCatalogo().getComponente("8 GB"));
        builder.setDisco(getCatalogo().getComponente("HDD 500 GB"));
        builder.setGabinete(getCatalogo().getComponente("Gabinete Estandar"));
    }
}
