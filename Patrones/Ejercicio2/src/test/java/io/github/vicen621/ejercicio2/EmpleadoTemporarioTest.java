package io.github.vicen621.ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTemporarioTest {

    private EmpleadoTemporario empleadoTemporario;
    private static int HORAS_TRABAJADAS = 300;

    @BeforeEach
    public void setUp() {
        empleadoTemporario = new EmpleadoTemporario(2, true, HORAS_TRABAJADAS);
    }

    @Test
    public void getSueldoBasicoTest() {
        assertEquals(20_000 + 300 * HORAS_TRABAJADAS, empleadoTemporario.getSueldoBasico());
    }
}
