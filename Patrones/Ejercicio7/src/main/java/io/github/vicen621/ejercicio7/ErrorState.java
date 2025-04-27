package io.github.vicen621.ejercicio7;

public class ErrorState implements State {
    @Override
    public String getResultado(Calculadora calculadora) {
        return "Error";
    }

    @Override
    public void borrar(Calculadora calculadora) {
        calculadora.reset();
    }

    @Override
    public void setValor(Calculadora calculadora, double unValor) {
        throw new RuntimeException("La calculadora se encuentra en estado de error");
    }

    @Override
    public void mas(Calculadora calculadora) {
        throw new RuntimeException("La calculadora se encuentra en estado de error");
    }

    @Override
    public void menos(Calculadora calculadora) {
        throw new RuntimeException("La calculadora se encuentra en estado de error");
    }

    @Override
    public void por(Calculadora calculadora) {
        throw new RuntimeException("La calculadora se encuentra en estado de error");
    }

    @Override
    public void dividido(Calculadora calculadora) {
        throw new RuntimeException("La calculadora se encuentra en estado de error");
    }
}
