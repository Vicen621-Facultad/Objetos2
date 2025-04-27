package io.github.vicen621.ejercicio7.operaciones;

public class Suma implements Operacion {
    @Override
    public double operar(double a, double b) throws ArithmeticException {
        return a + b;
    }
}
