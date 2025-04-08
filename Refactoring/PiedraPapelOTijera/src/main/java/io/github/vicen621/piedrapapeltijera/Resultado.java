package io.github.vicen621.piedrapapeltijera;

import io.github.vicen621.piedrapapeltijera.options.Opcion;

public class Resultado {
    private Opcion ganador;

    public Resultado(Opcion ganador) {
        this.ganador = ganador;
    }

    public Opcion getGanador() {
        return ganador;
    }
}
