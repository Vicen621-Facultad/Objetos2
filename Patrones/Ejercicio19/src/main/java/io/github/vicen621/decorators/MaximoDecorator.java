package io.github.vicen621.decorators;

import io.github.vicen621.WeatherData;
import io.github.vicen621.strategies.TemperatureStrategy;

import java.util.List;

public class MaximoDecorator extends WeatherDecorator {
    public MaximoDecorator(WeatherData componente, TemperatureStrategy strategy) {
        super(componente, strategy);
    }

    public MaximoDecorator(WeatherData componente) {
        super(componente);
    }

    @Override
    public String displayData() {
        return super.displayData() + displayMaximo();
    }

    public String displayMaximo() {
        List<Double> temperaturas = this.getTemperaturas();
        double maximo = temperaturas.stream()
                .max(Double::compareTo)
                .orElse(0.0);
        return String.format("; Máximo: %.2f", formatTemperature(maximo));
    }
}
