package io.github.vicen621.ejercicio2;

public abstract class EmpleadoConFamilia extends Empleado {
    private int cantidadHijos;
    private boolean casado;

    public EmpleadoConFamilia(int cantidadHijos, boolean casado) {
        this.cantidadHijos = cantidadHijos;
        this.casado = casado;
    }

    @Override
    public double getSueldoAdicional() {
        double adicional = 2_000 * cantidadHijos;
        if  (casado)
            adicional += 5_000;
        return adicional + getSuma();
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    protected abstract double getSuma();
}
