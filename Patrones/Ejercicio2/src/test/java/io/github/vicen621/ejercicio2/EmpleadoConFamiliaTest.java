package io.github.vicen621.ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoConFamiliaTest {
    private EmpleadoConFamilia empleadoConFamilia;
    private static int CANTIDAD_HIJOS = 2;

    @BeforeEach
    public void setUp() {
        empleadoConFamilia = new EmpleadoTemporario(CANTIDAD_HIJOS, true, 100);
    }

    @Test
    public void getSueldoAdicionalTest() {
        double adicional = 5_000 + 2_000 * CANTIDAD_HIJOS + empleadoConFamilia.getSuma();
        assertEquals(adicional, empleadoConFamilia.getSueldoAdicional());
    }
}
