package io.github.vicen621.ejercicio2;

public class EmpleadoPlanta extends EmpleadoConFamilia {
    private int antiguedad;

    public EmpleadoPlanta(int cantidadHijos, boolean casado, int antiguedad) {
        super(cantidadHijos, casado);
        this.antiguedad = antiguedad;
    }

    @Override
    public double getSueldoBasico() {
        return 50_000;
    }

    @Override
    protected double getSuma() {
        return 2_000 * antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
