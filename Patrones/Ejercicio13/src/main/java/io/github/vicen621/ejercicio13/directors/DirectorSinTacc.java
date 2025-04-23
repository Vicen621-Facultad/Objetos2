package io.github.vicen621.ejercicio13.directors;

import io.github.vicen621.ejercicio13.Builder;

public class DirectorSinTacc implements IDirector {
    public void makeSandwich(Builder builder) {
        double panChipa = 150;
        double tartara = 18;
        double pollo = 250;
        double verduras = 200;
        builder.setPan(panChipa);
        builder.setAderezo(tartara);
        builder.setPrincipal(pollo);
        builder.setAdicional(verduras);
    }
}
