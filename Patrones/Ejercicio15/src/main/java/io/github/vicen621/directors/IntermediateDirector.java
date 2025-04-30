package io.github.vicen621.directors;

import io.github.vicen621.Catalogo;
import io.github.vicen621.builders.Builder;

public class IntermediateDirector extends Director {
    public IntermediateDirector(Catalogo catalogo) {
        super(catalogo);
    }

    @Override
    public void buildPC(Builder builder) {
        builder.setProcesador(getCatalogo().getComponente("Procesador Intermedio"));
        builder.setRam(getCatalogo().getComponente("16 GB"));
        builder.setDisco(getCatalogo().getComponente("SSD 500 GB"));
        builder.setGrafica(getCatalogo().getComponente("GTX 1650"));
        builder.setGabinete(getCatalogo().getComponente("Gabinete Intermedio"));
        builder.setFuente(getCatalogo().getComponente("Fuente 800 w"));
    }
}
