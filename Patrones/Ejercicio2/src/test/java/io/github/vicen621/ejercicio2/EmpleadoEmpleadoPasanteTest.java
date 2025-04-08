package io.github.vicen621.ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoEmpleadoPasanteTest {

    private EmpleadoPasante empleadoPasante;

    @BeforeEach
    public void setUp() {
        empleadoPasante = new EmpleadoPasante(2);
    }

    @Test
    public void getSueldoAdicionalTest() {
        assertEquals(2_000 * empleadoPasante.getExamenesRendidos(), empleadoPasante.getSueldoAdicional());
    }
}
