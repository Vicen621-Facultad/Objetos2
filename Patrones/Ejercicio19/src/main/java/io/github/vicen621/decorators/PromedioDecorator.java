package io.github.vicen621.decorators;

import io.github.vicen621.WeatherData;
import io.github.vicen621.strategies.TemperatureStrategy;

import java.util.List;

public class PromedioDecorator extends WeatherDecorator {
    public PromedioDecorator(WeatherData componente, TemperatureStrategy strategy) {
        super(componente, strategy);
    }

    public PromedioDecorator(WeatherData componente) {
        super(componente);
    }

    @Override
    public String displayData() {
        return super.displayData() + displayPromedio();
    }

    public String displayPromedio() {
        List<Double> temperaturas = this.getTemperaturas();
        double promedio = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .sum() / temperaturas.size();
        return String.format("; Promedio: %.2f", formatTemperature(promedio));
    }
}
