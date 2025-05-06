package io.github.vicen621;

import java.util.List;

public class HomeWeatherStation implements WeatherData {
    private double temperatura;
    private double radiacion;
    private double presion;

    public HomeWeatherStation(double temperatura, double radiacion, double presion) {
        this.temperatura = temperatura;
        this.radiacion = radiacion;
        this.presion = presion;
    }

    //retorna la temperatura en grados Fahrenheit.
    public double getTemperatura() {
        return temperatura;
    }

    //retorna la presión atmosférica en hPa
    public double getPresion() {
        return presion;
    }

    //retorna la radiación solar
    public double getRadiacionSolar() {
        return radiacion;
    }

    //retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
    public List<Double> getTemperaturas() {
        return List.of(86.0, 80.6, 89.6, 87.8);
    }

    //retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
    public String displayData(){
        return "Temperatura F: " + this.getTemperatura() +
                "; Presión atmosf: " + this.getPresion() +
                "; Radiación solar: " + this.getRadiacionSolar();
    }
}
