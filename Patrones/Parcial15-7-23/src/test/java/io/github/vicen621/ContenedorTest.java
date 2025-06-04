package io.github.vicen621;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContenedorTest {

    @Test
    public void testContenedor() {
        Boton boton = new Boton("Aceptar", "accept()");
        Etiqueta etiqueta = new Etiqueta("Parcial de objetos");
        Contenedor contenedor = new Contenedor();
        contenedor.addChild(boton);
        contenedor.addChild(etiqueta);
        contenedor.aplicarEstilo(new ConfiguracionDeEstilo());
        System.out.println(contenedor.imprimir());
    }
}
