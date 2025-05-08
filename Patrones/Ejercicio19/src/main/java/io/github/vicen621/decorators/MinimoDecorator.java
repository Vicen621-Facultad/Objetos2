package io.github.vicen621.decorators;

import io.github.vicen621.WeatherData;

import java.util.List;

public class MinimoDecorator extends WeatherDecorator {
    public MinimoDecorator(WeatherData componente) {
        super(componente);
    }

    @Override
    public String displayDecorator() {
        List<Double> temperaturas = this.getTemperaturas();
        double minimo = temperaturas.stream()
                .min(Double::compareTo)
                .orElse(0.0);
        return String.format("; Mínimo: %.2f", minimo);
    }
}
