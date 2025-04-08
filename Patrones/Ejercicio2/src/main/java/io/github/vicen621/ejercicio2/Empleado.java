package io.github.vicen621.ejercicio2;

public abstract class Empleado {
    public abstract double getSueldoBasico();
    public abstract double getSueldoAdicional();

    public double getDescuento() {
        double descuentoBasico = getSueldoBasico() * .13;
        double descuentoAdicional = getSueldoAdicional() * .05;
        return descuentoBasico + descuentoAdicional;
    }

    public double sueldo() {
        return getSueldoBasico() + getSueldoAdicional() - getDescuento();
    }

}
