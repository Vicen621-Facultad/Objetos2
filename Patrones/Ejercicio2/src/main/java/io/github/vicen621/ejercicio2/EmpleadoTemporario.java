package io.github.vicen621.ejercicio2;

public class EmpleadoTemporario extends EmpleadoConFamilia {
    private int horasTrabajadas;

    public EmpleadoTemporario(int cantidadHijos, boolean casado, int horasTrabajadas) {
        super(cantidadHijos, casado);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double getSueldoBasico() {
        return 20_000 + 300 * horasTrabajadas;
    }

    @Override
    protected double getSuma() {
        return 0;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
