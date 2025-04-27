package io.github.vicen621.ejercicio7;

import io.github.vicen621.ejercicio7.operaciones.Division;
import io.github.vicen621.ejercicio7.operaciones.Multiplicacion;
import io.github.vicen621.ejercicio7.operaciones.Resta;
import io.github.vicen621.ejercicio7.operaciones.Suma;

public class WaitingInstructionState implements State{
    @Override
    public String getResultado(Calculadora calculadora) {
        return calculadora.getValorAcumulado() + "";
    }

    @Override
    public void borrar(Calculadora calculadora) {
        calculadora.reset();
    }

    @Override
    public void setValor(Calculadora calculadora, double unValor) {
        calculadora.setState(new ErrorState());
    }

    @Override
    public void mas(Calculadora calculadora) {
        calculadora.setState(new WaitingValueState(new Suma()));
    }

    @Override
    public void menos(Calculadora calculadora) {
        calculadora.setState(new WaitingValueState(new Resta()));
    }

    @Override
    public void por(Calculadora calculadora) {
        calculadora.setState(new WaitingValueState(new Multiplicacion()));
    }

    @Override
    public void dividido(Calculadora calculadora) {
        calculadora.setState(new WaitingValueState(new Division()));
    }
}
