package io.github.vicen621.decorators;

import io.github.vicen621.WeatherData;

import java.util.List;

public abstract class WeatherDecorator implements WeatherData {
    private WeatherData inner;

    public WeatherDecorator(WeatherData inner) {
        this.inner = inner;
    }

    @Override
    public double getTemperatura() {
        return inner.getTemperatura();
    }

    @Override
    public double getPresion() {
        return inner.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return inner.getRadiacionSolar();
    }

    @Override
    public List<Double> getTemperaturas() {
        return inner.getTemperaturas();
    }

    @Override
    public String displayData() {
        return inner.displayData() + displayDecorator();
    }

    public abstract String displayDecorator();
}
