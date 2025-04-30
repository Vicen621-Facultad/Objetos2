package io.github.vicen621.ejercicio14;

public abstract class Bien {
    private double liquidez;

    public Bien(double liquidez) {
        this.liquidez = liquidez;
    }

    public double getValorPrendario() {
        return this.getValor() * liquidez;
    }

    public abstract double getValor();
}
