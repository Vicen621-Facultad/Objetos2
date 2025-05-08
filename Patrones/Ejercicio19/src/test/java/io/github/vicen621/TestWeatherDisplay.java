package io.github.vicen621;

import io.github.vicen621.decorators.MaximoDecorator;
import io.github.vicen621.decorators.MinimoDecorator;
import io.github.vicen621.decorators.PromedioDecorator;
import org.junit.jupiter.api.Test;

public class TestWeatherDisplay {

    @Test
    public void test_promedio_minimo_maximo() {
        WeatherData station = new CelsiusAdapter(
                new HomeWeatherStation(86, 200, 1008)
        );

        WeatherData decorator = new PromedioDecorator(station);
        decorator = new MinimoDecorator(decorator);
        decorator = new MaximoDecorator(decorator);

        System.out.println(decorator.displayData());
    }
}
