package io.github.vicen621.ejercicio13.directors;

import io.github.vicen621.ejercicio13.Builder;

public class DirectorVegetariano implements IDirector {
    @Override
    public void makeSandwich(Builder builder) {
        double panSemillas = 120;
        double sinAderezo = 0;
        double provoleta = 200;
        double berenjenas = 100;
        builder.setPan(panSemillas);
        builder.setAderezo(sinAderezo);
        builder.setPrincipal(provoleta);
        builder.setAdicional(berenjenas);
    }
}
