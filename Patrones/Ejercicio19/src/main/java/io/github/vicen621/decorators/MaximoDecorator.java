package io.github.vicen621.decorators;

import io.github.vicen621.WeatherData;

import java.util.List;

public class MaximoDecorator extends WeatherDecorator {
    public MaximoDecorator(WeatherData componente) {
        super(componente);
    }

    @Override
    public String displayDecorator() {
        List<Double> temperaturas = this.getTemperaturas();
        double maximo = temperaturas.stream()
                .max(Double::compareTo)
                .orElse(0.0);
        return String.format("; Máximo: %.2f", maximo);
    }
}
