package io.github.vicen621.ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoPlantaTest {

    private EmpleadoPlanta empleadoPlanta;
    private static int ANTIGUEDAD = 4;
    private static int CANTIDAD_HIJOS = 2;


    @BeforeEach
    public void setUp() {
        empleadoPlanta = new EmpleadoPlanta(CANTIDAD_HIJOS, true, ANTIGUEDAD);
    }

    @Test
    public void getSumaTest() {
        assertEquals(2_000 * ANTIGUEDAD, empleadoPlanta.getSuma());
    }
}
