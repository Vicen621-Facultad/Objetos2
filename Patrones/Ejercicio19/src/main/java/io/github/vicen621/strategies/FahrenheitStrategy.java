package io.github.vicen621.strategies;

public class FahrenheitStrategy implements TemperatureStrategy {
    @Override
    public double format(double fahrenheit) {
        return fahrenheit;
    }
}
