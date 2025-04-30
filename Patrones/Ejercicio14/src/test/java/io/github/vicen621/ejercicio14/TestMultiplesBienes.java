package io.github.vicen621.ejercicio14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMultiplesBienes {
    private Bien bien;

    @BeforeEach
    public void setUp() {
        Bien alquiler = new Alquiler(
                LocalDate.of(2023, 12, 1),
                LocalDate.of(2026, 12, 1),
                1_000
        );

        Bien automovil = new Automovil(1_000, 2023, 100_000);

        this.bien = new MultiplesBienes(List.of(alquiler, automovil));
    }

    @Test
    public void testValor() {
        assertEquals(20_000 + 200, bien.getValor());
    }

    @Test
    public void getValorPrendario() {
        assertEquals(20_200 * .5, bien.getValorPrendario());
    }
}
