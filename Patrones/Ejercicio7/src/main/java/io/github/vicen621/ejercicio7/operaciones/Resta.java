package io.github.vicen621.ejercicio7.operaciones;

public class Resta implements Operacion {
    @Override
    public double operar(double a, double b) throws ArithmeticException {
        return a - b;
    }
}
