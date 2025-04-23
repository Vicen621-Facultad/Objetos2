package io.github.vicen621.ejercicio13;

public class Director {
    public void makeClasico(Builder builder) {
        double brioche = 100;
        double mayonesa = 20;
        double carneTernera = 300;
        double tomate = 80;
        builder.setPan(brioche);
        builder.setAderezo(mayonesa);
        builder.setPrincipal(carneTernera);
        builder.setAdicional(tomate);
    }

    public void makeVegetariano(Builder builder) {
        double panSemillas = 120;
        double sinAderezo = 0;
        double provoleta = 200;
        double berenjenas = 100;
        builder.setPan(panSemillas);
        builder.setAderezo(sinAderezo);
        builder.setPrincipal(provoleta);
        builder.setAdicional(berenjenas);
    }

    public void makeVegano(Builder builder) {
        double panIntegral = 100;
        double criolla = 20;
        double milanesaGirgolas = 500;
        double sinAdicional = 0;
        builder.setPan(panIntegral);
        builder.setAderezo(criolla);
        builder.setPrincipal(milanesaGirgolas);
        builder.setAdicional(sinAdicional);
    }

    public void makeSinTacc(Builder builder) {
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
