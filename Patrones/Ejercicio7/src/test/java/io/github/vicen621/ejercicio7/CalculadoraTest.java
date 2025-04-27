package io.github.vicen621.ejercicio7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    void testOperacionSumaBasica() {
        calc.setValor(5);
        calc.mas();
        calc.setValor(3);
        assertEquals("8.0", calc.getResultado());
    }

    @Test
    void testOperacionMultiplicacion() {
        calc.setValor(5);
        calc.mas();
        calc.setValor(3);
        calc.por();
        calc.setValor(2);
        assertEquals("16.0", calc.getResultado());
    }

    @Test
    void testDivisionCorrecta() {
        calc.setValor(8);
        calc.dividido();
        calc.setValor(2);
        assertEquals("4.0", calc.getResultado());
    }

    @Test
    void testDivisionPorCero() {
        calc.setValor(8);
        calc.dividido();
        calc.setValor(0);
        assertEquals("Error", calc.getResultado());
    }

    @Test
    void testErrorPorNoEnviarSetValor() {
        calc.setValor(5);
        calc.mas();
        calc.mas(); // En vez de setValor primero
        assertEquals("Error", calc.getResultado());
    }

    @Test
    void testErrorPorEnviarMensajeInvalidoEsperandoValor() {
        calc.setValor(10);
        calc.menos(); // esperando setValor()
        calc.por();   // envía otro operador en lugar de setValor
        assertEquals("Error", calc.getResultado());
    }

    @Test
    void testBorrarDesdeEstadoNormal() {
        calc.setValor(5);
        calc.borrar();
        assertEquals("0.0", calc.getResultado());
    }

    @Test
    void testBorrarDesdeEstadoError() {
        calc.setValor(8);
        calc.dividido();
        calc.setValor(0); // provoca error
        assertEquals("Error", calc.getResultado());
        
        calc.borrar();    // resetea
        assertEquals("0.0", calc.getResultado());
    }

    @Test
    void testOperacionDespuesDeBorrar() {
        calc.setValor(5);
        calc.mas();
        calc.setValor(3);
        calc.borrar();
        calc.setValor(2);
        calc.por();
        calc.setValor(4);
        assertEquals("8.0", calc.getResultado());
    }
}
