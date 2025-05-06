package io.github.vicen621.strategies;

public class CelciusStrategy implements TemperatureStrategy {
    @Override
    public double format(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}
