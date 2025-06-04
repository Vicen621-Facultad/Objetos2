package io.github.vicen621;

public class Producto {
    private double precio;
    private double IVA;

    public Producto(double precio, double IVA) {
        this.precio = precio;
        this.IVA = IVA;
    }

    public double getPrecioConIVA() {
        return this.getPrecio() + (this.getPrecio() * this.getIVA());
    }

    public double getPrecio() {
        return precio;
    }

    public double getIVA() {
        return IVA;
    }
}
