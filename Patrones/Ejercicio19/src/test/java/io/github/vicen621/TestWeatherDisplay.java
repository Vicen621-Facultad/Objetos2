package io.github.vicen621;

import io.github.vicen621.decorators.MaximoDecorator;
import io.github.vicen621.decorators.MinimoDecorator;
import io.github.vicen621.decorators.PromedioDecorator;
import io.github.vicen621.strategies.CelciusStrategy;
import org.junit.jupiter.api.Test;

public class TestWeatherDisplay {

    @Test
    public void test_promedio_minimo_maximo() {
        WeatherData station = new HomeWeatherStation(86, 200, 1008);

        WeatherData decorator = new PromedioDecorator(station, new CelciusStrategy());
        decorator = new MinimoDecorator(decorator, new CelciusStrategy());
        decorator = new MaximoDecorator(decorator, new CelciusStrategy());

        System.out.println(decorator.displayData());
    }
}
