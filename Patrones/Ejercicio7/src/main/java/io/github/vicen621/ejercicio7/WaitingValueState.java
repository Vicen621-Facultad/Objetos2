package io.github.vicen621.ejercicio7;

import io.github.vicen621.ejercicio7.operaciones.Operacion;

public class WaitingValueState implements State {
    private Operacion operacionPendiente;

    public WaitingValueState(Operacion operacionPendiente) {
        this.operacionPendiente = operacionPendiente;
    }

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
        try {
            calculadora.setValorState(operacionPendiente.operar(calculadora.getValorAcumulado(), unValor));
            calculadora.setState(new WaitingInstructionState());
        } catch (ArithmeticException e) {
            calculadora.setState(new ErrorState());
        }
    }

    @Override
    public void mas(Calculadora calculadora) {
        calculadora.setState(new ErrorState());
    }

    @Override
    public void menos(Calculadora calculadora) {
        calculadora.setState(new ErrorState());
    }

    @Override
    public void por(Calculadora calculadora) {
        calculadora.setState(new ErrorState());
    }

    @Override
    public void dividido(Calculadora calculadora) {
        calculadora.setState(new ErrorState());
    }
}
