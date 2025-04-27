package io.github.vicen621.ejercicio7;

import io.github.vicen621.ejercicio7.operaciones.Suma;

public class Calculadora {
    private double valorAcumulado;
    private State state;

    public Calculadora() {
        reset();
    }

    /**
     * Devuelve el resultado actual de la operación realizada.
     * Si no se ha realizado ninguna operación, devuelve el valor acumulado.
     * Si la calculadora se encuentra en error, devuelve “error”
     */
    public String getResultado() {
        return state.getResultado(this);
    }


    /**
     * Pone en cero el valor acumulado y reinicia la calculadora
     */
    public void borrar() {
        state.borrar(this);
    }


    /**
     * Asigna un valor para operar.
     * si hay una operación en curso, el valor será utilizado en la operación
     */
    public void setValor(double unValor) {
        state.setValor(this, unValor);
    }


    /**
     * Indica que la calculadora debe esperar un nuevo valor.
     * Si a continuación se le envía el mensaje setValor(), la calculadora sumará
     * el valor recibido como parámetro, al valor actual y guardará el resultado
     */
    public void mas() {
        state.mas(this);
    }

    public void menos() {
        state.menos(this);
    }

    public void por() {
        state.por(this);
    }

    public void dividido() {
        state.dividido(this);
    }

    protected void reset() {
        this.valorAcumulado = 0;
        // Lo inicializo con la operacion suma ya que al primer setValue se suma el valor con 0
        this.state = new WaitingValueState(new Suma());
    }

    protected double getValorAcumulado() {
        return this.valorAcumulado;
    }

    protected void setValorState(double unValor) {
        this.valorAcumulado = unValor;
    }

    protected void setState(State state) {
        this.state = state;
    }
 }
