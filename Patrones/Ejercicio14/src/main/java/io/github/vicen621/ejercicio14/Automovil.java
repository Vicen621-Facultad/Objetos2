package io.github.vicen621.ejercicio14;

import java.time.LocalDate;

public class Automovil extends Bien {
    private double costo0km;
    private int modelo;
    private double kilometraje;

    public Automovil(double costo0km, int modelo, double kilometraje) {
        super(.7);
        this.costo0km = costo0km;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    @Override
    public double getValor() {
        double REDUCCION_POR_ANIO = 0.1;
        return (REDUCCION_POR_ANIO * (LocalDate.now().getYear() - modelo)) * costo0km;
    }
}
