package io.github.vicen621.ejercicio13.directors;

import io.github.vicen621.ejercicio13.Builder;

public class DirectorVegano implements IDirector {
    @Override
    public void makeSandwich(Builder builder) {
        double panIntegral = 100;
        double criolla = 20;
        double milanesaGirgolas = 500;
        double sinAdicional = 0;
        builder.setPan(panIntegral);
        builder.setAderezo(criolla);
        builder.setPrincipal(milanesaGirgolas);
        builder.setAdicional(sinAdicional);
        builder.setPrincipal(milanesaGirgolas);
    }
}
