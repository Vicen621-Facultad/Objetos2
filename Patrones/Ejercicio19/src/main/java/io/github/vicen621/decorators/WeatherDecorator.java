package io.github.vicen621.decorators;

import io.github.vicen621.WeatherData;
import io.github.vicen621.strategies.FahrenheitStrategy;
import io.github.vicen621.strategies.TemperatureStrategy;

import java.util.List;

//TODO: No se como hacer lo de los celcius
public abstract class WeatherDecorator implements WeatherData {
    private WeatherData componente;
    private TemperatureStrategy strategy;

    public WeatherDecorator(WeatherData componente, TemperatureStrategy strategy) {
        this.componente = componente;
        this.strategy = strategy;
    }

    public WeatherDecorator(WeatherData componente) {
        this(componente, new FahrenheitStrategy());
    }

    @Override
    public double getTemperatura() {
        return componente.getTemperatura();
    }

    @Override
    public double getPresion() {
        return componente.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return componente.getRadiacionSolar();
    }

    @Override
    public List<Double> getTemperaturas() {
        return componente.getTemperaturas();
    }

    @Override
    public String displayData() {
        return componente.displayData();
    }

    public void setStrategy(TemperatureStrategy strategy) {
        this.strategy = strategy;
    }

    public double formatTemperature(double fahrenheit) {
        return strategy.format(fahrenheit);
    }
}
