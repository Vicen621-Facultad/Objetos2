package io.github.vicen621.ejercicio11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MixtaTest {
    Topografia topografia;

    @BeforeEach
    public void setUp() {
        Mixta mixta = new Mixta();
        mixta.addChild(new Agua());
        mixta.addChild(new Tierra());
        mixta.addChild(new Tierra());
        mixta.addChild(new Agua());


        topografia = new Mixta();
        topografia.addChild(new Agua());
        topografia.addChild(new Tierra());
        topografia.addChild(new Tierra());
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
        mixta.addChild(new Pantano());
        mixta.addChild(new Tierra());
        mixta.addChild(new Tierra());
        mixta.addChild(new Agua());

        Mixta mixta2 = new Mixta();
        mixta2.addChild(new Pantano());
        mixta2.addChild(new Tierra());
        mixta2.addChild(new Tierra());
        mixta2.addChild(new Agua());

        assertTrue(mixta.equals(mixta2));
    }

    @Test
    public void testNotEqualsMixta() {
        Mixta mixta = new Mixta(); // Tierra, pantano, tierra agua
        mixta.addChild(new Tierra());
        mixta.addChild(new Pantano());
        mixta.addChild(new Tierra());
        mixta.addChild(new Agua());

        Mixta mixta2 = new Mixta(); // Pantano, tierra, tierra, agua
        mixta2.addChild(new Pantano());
        mixta2.addChild(new Tierra());
        mixta2.addChild(new Tierra());
        mixta2.addChild(new Agua());

        assertFalse(mixta.equals(mixta2));
    }
}
