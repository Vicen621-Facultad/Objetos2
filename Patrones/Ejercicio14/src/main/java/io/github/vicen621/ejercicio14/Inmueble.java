package io.github.vicen621.ejercicio14;

public class Inmueble extends Bien {
    private String direccion;
    private double superficie;
    private double costom2;

    public Inmueble(String direccion, double superficie, double costom2) {
        super(.2);
        this.direccion = direccion;
        this.superficie = superficie;
        this.costom2 = costom2;
    }

    @Override
    public double getValor() {
        return this.superficie * this.costom2;
    }
}
