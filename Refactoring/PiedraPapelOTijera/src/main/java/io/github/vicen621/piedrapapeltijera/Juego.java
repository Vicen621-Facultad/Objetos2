package io.github.vicen621.piedrapapeltijera;

import io.github.vicen621.piedrapapeltijera.options.Opcion;

public class Juego {
    public Resultado jugar(Opcion opcion1, Opcion opcion2) {
        return opcion1.jugarContra(opcion2);
    }
}
