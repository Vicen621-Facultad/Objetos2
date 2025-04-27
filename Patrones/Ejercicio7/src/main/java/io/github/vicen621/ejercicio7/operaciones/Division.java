package io.github.vicen621.ejercicio7.operaciones;

public class Division implements Operacion {
    @Override
    public double operar(double a, double b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("No se puede dividir por 0");
        return a / b;
    }
}
