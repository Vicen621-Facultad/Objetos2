package io.github.vicen621.ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {
    private Empleado empleado;

    public EmpleadoTest() {
        empleado = new EmpleadoPasante(2);
    }

    @Test
    public void getDescuentoTest() {
        double descuento = empleado.getSueldoBasico() * .13 + empleado.getSueldoAdicional() * .05;
        assertEquals(descuento, empleado.getDescuento());
    }

    @Test
    public void sueldoTest() {
        double basico = empleado.getSueldoBasico();
        double adicional = empleado.getSueldoAdicional();
        double descuento = empleado.getDescuento();
        assertEquals(basico + adicional - descuento, empleado.sueldo());
    }
}
