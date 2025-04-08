package io.github.vicen621.ejercicio1;

import io.github.vicen621.ejercicio1.exporters.VoorheesExporter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void agregarSocioTest() {
        Socio socio = new Socio("Arya Stark", "needle@stark.com", "5234-5");
        biblioteca.agregarSocio(socio);
        assertEquals(new VoorheesExporter().exportar(Collections.singletonList(socio)), biblioteca.exportarSocios());
    }

    @Test
    public void exportarSociosVaciosTest() {
        assertEquals("[]", biblioteca.exportarSocios());
    }

    @Test
    public void exportarSociosConSociosTest() {
        List<Socio> socios = new ArrayList<>();
        Socio socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
        Socio socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2");
        socios.add(socio1);
        socios.add(socio2);
        biblioteca.agregarSocio(socio1);
        biblioteca.agregarSocio(socio2);
        assertEquals(new VoorheesExporter().exportar(socios), biblioteca.exportarSocios());
    }
}
