package io.github.vicen621.ejercicio7;

public interface State {
    String getResultado(Calculadora calculadora);
    void borrar(Calculadora calculadora);
    void setValor(Calculadora calculadora, double unValor);
    void mas(Calculadora calculadora);
    void menos(Calculadora calculadora);
    void por(Calculadora calculadora);
    void dividido(Calculadora calculadora);
}
