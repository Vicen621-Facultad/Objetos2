package io.github.vicen621.decorators;

import io.github.vicen621.WeatherData;
import io.github.vicen621.strategies.TemperatureStrategy;

import java.util.List;

public class MinimoDecorator extends WeatherDecorator {
    public MinimoDecorator(WeatherData componente, TemperatureStrategy strategy) {
        super(componente, strategy);
    }

    public MinimoDecorator(WeatherData componente) {
        super(componente);
    }

    @Override
    public String displayData() {
        return super.displayData() + displayMinimo();
    }

    public String displayMinimo() {
        List<Double> temperaturas = this.getTemperaturas();
        double minimo = temperaturas.stream()
                .min(Double::compareTo)
                .orElse(0.0);
        return String.format("; Mínimo: %.2f", formatTemperature(minimo));
    }
}
