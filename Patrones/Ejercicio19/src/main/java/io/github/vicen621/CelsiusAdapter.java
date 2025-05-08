package io.github.vicen621;

import java.util.List;
import java.util.stream.Collectors;

public class CelsiusAdapter implements WeatherData {
    private HomeWeatherStation wrapee;

    public CelsiusAdapter(HomeWeatherStation station) {
        wrapee = station;
    }

    @Override
    public double getTemperatura() {
        return formatFahrenheitToCelsius(wrapee.getTemperatura());
    }

    @Override
    public double getPresion() {
        return wrapee.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return wrapee.getRadiacionSolar();
    }

    //retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
    public List<Double> getTemperaturas() {
        return wrapee.getTemperaturas().stream()
                .map(this::formatFahrenheitToCelsius)
                .collect(Collectors.toList());
    }

    //retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
    public String displayData(){
        return "Temperatura C: " + this.getTemperatura() +
                "; Presión atmosf: " + this.getPresion() +
                "; Radiación solar: " + this.getRadiacionSolar();
    }

    private double formatFahrenheitToCelsius(double temperatura) {
        return (temperatura - 32) / 1.8;
    }
}
