package io.github.vicen621.ejercicio14;

import java.time.LocalDate;

public class Alquiler extends Bien {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double costoMensual;

    public Alquiler(LocalDate fechaInicio, LocalDate fechaFin, double costoMensual) {
        super(.9);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoMensual = costoMensual;
    }

    @Override
    public double getValor() {
        int aniosFaltantes = (this.fechaFin.getYear() - LocalDate.now().getYear()) * 12;
        int mesesFaltantes = this.fechaFin.getMonthValue() - LocalDate.now().getMonthValue();

        return (aniosFaltantes + mesesFaltantes) * this.costoMensual;
    }
}
