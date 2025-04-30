package io.github.vicen621.directors;

import io.github.vicen621.Catalogo;
import io.github.vicen621.builders.Builder;

public class GamerDirector extends Director {

    public GamerDirector(Catalogo catalogo) {
        super(catalogo);
    }

    @Override
    public void buildPC(Builder builder) {
        builder.reset();
        builder.setProcesador(getCatalogo().getComponente("Procesador gamer"));
        builder.setRam(getCatalogo().getComponente("32 gb + 32 gb"));
        builder.setDisco(getCatalogo().getComponente("SSD 500gb + SSD 1 TB"));
        builder.setGrafica(getCatalogo().getComponente("RTX 4090"));

        double CONSUMO_AGREGADO = 1.5;
        double consumo = builder.getConsumo() * CONSUMO_AGREGADO;

        builder.setGabinete(getCatalogo().getComponente("Gabinete Gamer"));
        builder.setFuente(getCatalogo().getComponente("Fuente " + consumo + "w"));
    }
}
