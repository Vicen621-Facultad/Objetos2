package io.github.vicen621.decorators;

import io.github.vicen621.WeatherData;

import java.util.List;

public class PromedioDecorator extends WeatherDecorator {
    public PromedioDecorator(WeatherData componente) {
        super(componente);
    }

    @Override
    public String displayDecorator() {
        List<Double> temperaturas = this.getTemperaturas();
        double promedio = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .sum() / temperaturas.size();
        return String.format("; Promedio: %.2f", promedio);
    }
}
