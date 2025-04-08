package io.github.vicen621.ejercicio2;

public class EmpleadoPasante extends Empleado {
    private int examenesRendidos;

    public EmpleadoPasante(int examenesRendidos) {
        this.examenesRendidos = examenesRendidos;
    }

    @Override
    public double getSueldoBasico() {
        return 20_000;
    }

    @Override
    public double getSueldoAdicional() {
        return 2_000 * examenesRendidos;
    }

    public int getExamenesRendidos() {
        return examenesRendidos;
    }

    public void setExamenesRendidos(int examenesRendidos) {
        this.examenesRendidos = examenesRendidos;
    }
}
