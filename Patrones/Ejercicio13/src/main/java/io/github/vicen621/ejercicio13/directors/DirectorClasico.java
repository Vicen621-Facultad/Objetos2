package io.github.vicen621.ejercicio13.directors;

import io.github.vicen621.ejercicio13.Builder;

public class DirectorClasico implements IDirector {
    @Override
    public void makeSandwich(Builder builder) {
        double brioche = 100;
        double mayonesa = 20;
        double carneTernera = 300;
        double tomate = 80;
        builder.setPan(brioche);
        builder.setAderezo(mayonesa);
        builder.setPrincipal(carneTernera);
        builder.setAdicional(tomate);
    }
}
