package io.github.vicen621.ejercicio6;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExcursionTest {

    @Test
    public void testInscripcionCuandoExcursionEstaLlena() {
        Excursion excursion = new Excursion(
                "Dos días en kayak bajando el Paraná",
                15000.0,
                LocalDate.of(2025, 01, 20),
                LocalDate.of(2025, 01, 21),
                "Puerto de salida",
                1,
                2
        );

        User usuario1 = new User("Juan", "Pérez", "juan@example.com");
        User usuario2 = new User("Lucía", "Gómez", "lucia@example.com");

        excursion.inscribir(usuario1);
        excursion.inscribir(usuario2);

        // Excursión llena (cupo máximo = 2)

        // Intento agregar otro usuario
        User usuario3 = new User("Carlos", "Ruiz", "carlos@example.com");
        excursion.inscribir(usuario3);

        // Verifico que el usuario3 esté en la lista de espera
        assertTrue(excursion.getListaEspera().contains(usuario3));

        // Imprimo estado actual
        System.out.println(excursion.obtenerInformacion());
    }

    @Test
    public void testInformacionConCupoMinimoNoAlcanzado() {
        Excursion excursion = new Excursion(
                "Dos días en kayak bajando el Paraná",
                10000,
                LocalDate.of(2025, 4, 20),
                LocalDate.of(2025, 4, 21),
                "Puerto de San Pedro",
                3,
                5
        );

        excursion.inscribir(new User("Juan", "Pérez", "juan@gmail.com"));

        String info = excursion.obtenerInformacion();
        System.out.println(info);

        // Debería incluir: nombre, costo, fechas, punto de encuentro,
        // y cantidad de usuarios faltantes para alcanzar el cupo mínimo (faltan 2)
        assertTrue(info.contains("Dos días en kayak bajando el Paraná"));
        assertTrue(info.contains("10000"));
        assertTrue(info.contains("04/20/25"));
        assertTrue(info.contains("Puerto de San Pedro"));
        assertTrue(info.contains("Cantidad usuarios faltantes para alcanzar cupo minimo: 2"));
    }

    @Test
    public void testInformacionConCupoMinimoAlcanzadoPeroNoMaximo() {
        Excursion excursion = new Excursion(
                "Dos días en kayak bajando el Paraná",
                10000,
                LocalDate.of(2025, 4, 20),
                LocalDate.of(2025, 4, 21),
                "Puerto de San Pedro",
                2,
                4
        );

        excursion.inscribir(new User("Juan", "Pérez", "juan@gmail.com"));
        excursion.inscribir(new User("Ana", "Gómez", "ana@gmail.com"));

        String info = excursion.obtenerInformacion();
        System.out.println(info);

        // Debería incluir: nombre, costo, fechas, punto de encuentro,
        // mails de usuarios inscriptos, y faltantes hasta el cupo máximo (faltan 2)
        assertTrue(info.contains("Dos días en kayak bajando el Paraná"));
        assertTrue(info.contains("juan@gmail.com"));
        assertTrue(info.contains("ana@gmail.com"));
        assertTrue(info.contains("Cantidad usuarios faltantes para alcanzar cupo máximo: 2"));
    }

    @Test
    public void testInformacionConCupoMaximoAlcanzado() {
        Excursion excursion = new Excursion(
                "Dos días en kayak bajando el Paraná",
                10000,
                LocalDate.of(2025, 4, 20),
                LocalDate.of(2025, 4, 21),
                "Puerto de San Pedro",
                1,
                2
        );

        excursion.inscribir(new User("Juan", "Pérez", "juan@gmail.com"));
        excursion.inscribir(new User("Ana", "Gómez", "ana@gmail.com"));

        // Este queda en lista de espera
        excursion.inscribir(new User("Luis", "Martínez", "luis@gmail.com"));

        String info = excursion.obtenerInformacion();
        System.out.println(info);

        // Debería incluir solo: nombre, costo, fechas y punto de encuentro
        assertTrue(info.contains("Dos días en kayak bajando el Paraná"));
        assertTrue(info.contains("10000"));
        assertTrue(info.contains("04/20/25"));
        assertTrue(info.contains("Puerto de San Pedro"));

        // No debería mostrar mails ni info de cupos
        assertFalse(info.contains("luis@gmail.com"));
        assertFalse(info.contains("Faltan"));
    }
}
