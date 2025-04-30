package io.github.vicen621.ejercicio11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MixtaTest {
    Topografia topografia;

    @BeforeEach
    public void setUp() {
        Mixta mixta = new Mixta();
        mixta.addChild(new Elemento(1));
        mixta.addChild(new Elemento(0));
        mixta.addChild(new Elemento(0));
        mixta.addChild(new Elemento(1));


        topografia = new Mixta();
        topografia.addChild(new Elemento(1));
        topografia.addChild(new Elemento(0));
        topografia.addChild(new Elemento(0));
        topografia.addChild(mixta);
    }

    @Test
    public void testAguaMixta() {
        assertEquals(.375, topografia.proporcionAgua());
    }

    @Test
    public void testTierraMixta() {
        assertEquals(.625, topografia.proporcionTierra());
    }

    @Test
    public void testEqualsMixta() {
        Mixta mixta = new Mixta();
        mixta.addChild(new Elemento(.75f));
        mixta.addChild(new Elemento(0));
        mixta.addChild(new Elemento(0));
        mixta.addChild(new Elemento(1));

        Mixta mixta2 = new Mixta();
        mixta2.addChild(new Elemento(.75f));
        mixta2.addChild(new Elemento(0));
        mixta2.addChild(new Elemento(0));
        mixta2.addChild(new Elemento(1));

        assertTrue(mixta.equals(mixta2));
    }

    @Test
    public void testNotEqualsMixta() {
        Mixta mixta = new Mixta(); // Tierra, pantano, tierra agua
        mixta.addChild(new Elemento(0));
        mixta.addChild(new Elemento(.75f));
        mixta.addChild(new Elemento(0));
        mixta.addChild(new Elemento(1));

        Mixta mixta2 = new Mixta(); // Pantano, tierra, tierra, agua
        mixta2.addChild(new Elemento(.75f));
        mixta2.addChild(new Elemento(0));
        mixta2.addChild(new Elemento(0));
        mixta2.addChild(new Elemento(1));

        assertFalse(mixta.equals(mixta2));
    }
}
