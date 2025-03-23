package io.github.vicen621.piedrapapeltijera;

import io.github.vicen621.piedrapapeltijera.options.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class JuegoTest {
    private Juego juego;

    @BeforeEach
    public void setup() {
        juego = new Juego();
    }

    @Test
    public void piedra_contra_tijera() {
        Piedra piedra = new Piedra();
        Tijera tijera = new Tijera();
        assertEquals(piedra, juego.jugar(piedra, tijera).getGanador());
    }

    @Test
    public void piedra_contra_papel() {
        Papel papel = new Papel();
        Piedra piedra = new Piedra();
        assertEquals(papel, juego.jugar(piedra, papel).getGanador());
    }

    @Test
    public void piedra_contra_piedra() {
        Piedra piedra = new Piedra();
        Piedra piedra2 = new Piedra();
        assertNull(juego.jugar(piedra, piedra2).getGanador());
    }

    @Test
    public void piedra_contra_spock() {
        Spock spock = new Spock();
        Piedra piedra = new Piedra();
        assertEquals(spock, juego.jugar(piedra, spock).getGanador());
    }

    @Test
    public void piedra_contra_lagarto() {
        Lagarto lagarto = new Lagarto();
        Piedra piedra = new Piedra();
        assertEquals(piedra, juego.jugar(piedra, lagarto).getGanador());
    }

    @Test
    public void papel_contra_tijera() {
        Papel papel = new Papel();
        Tijera tijera = new Tijera();
        assertEquals(tijera, juego.jugar(papel, tijera).getGanador());
    }

    @Test
    public void papel_contra_papel() {
        Papel papel = new Papel();
        Papel papel2 = new Papel();
        assertNull(juego.jugar(papel, papel2).getGanador());
    }

    @Test
    public void papel_contra_piedra() {
        Papel papel = new Papel();
        Piedra piedra = new Piedra();
        assertEquals(papel, juego.jugar(papel, piedra).getGanador());
    }

    @Test
    public void papel_contra_spock() {
        Spock spock = new Spock();
        Papel papel = new Papel();
        assertEquals(papel, juego.jugar(papel, spock).getGanador());
    }

    @Test
    public void papel_contra_lagarto() {
        Lagarto lagarto = new Lagarto();
        Papel papel = new Papel();
        assertEquals(lagarto, juego.jugar(papel, lagarto).getGanador());
    }

    @Test
    public void tijera_contra_tijera() {
        Tijera tijera = new Tijera();
        Tijera tijera2 = new Tijera();
        assertNull(juego.jugar(tijera, tijera2).getGanador());
    }

    @Test
    public void tijera_contra_papel() {
        Papel papel = new Papel();
        Tijera tijera = new Tijera();
        assertEquals(tijera, juego.jugar(tijera, papel).getGanador());
    }

    @Test
    public void tijera_contra_piedra() {
        Piedra piedra = new Piedra();
        Tijera tijera = new Tijera();
        assertEquals(piedra, juego.jugar(tijera, piedra).getGanador());
    }

    @Test
    public void tijera_contra_spock() {
        Spock spock = new Spock();
        Tijera tijera = new Tijera();
        assertEquals(spock, juego.jugar(tijera, spock).getGanador());
    }

    @Test
    public void tijera_contra_lagarto() {
        Lagarto lagarto = new Lagarto();
        Tijera tijera = new Tijera();
        assertEquals(tijera, juego.jugar(tijera, lagarto).getGanador());
    }

    @Test
    public void spock_contra_tijera() {
        Spock spock = new Spock();
        Tijera tijera = new Tijera();
        assertEquals(spock, juego.jugar(spock, tijera).getGanador());
    }

    @Test
    public void spock_contra_papel() {
        Papel papel = new Papel();
        Spock spock = new Spock();
        assertEquals(papel, juego.jugar(spock, papel).getGanador());
    }

    @Test
    public void spock_contra_piedra() {
        Piedra piedra = new Piedra();
        Spock spock = new Spock();
        assertEquals(spock, juego.jugar(spock, piedra).getGanador());
    }

    @Test
    public void spock_contra_spock() {
        Spock spock = new Spock();
        Spock spock2 = new Spock();
        assertNull(juego.jugar(spock, spock2).getGanador());
    }

    @Test
    public void spock_contra_lagarto() {
        Lagarto lagarto = new Lagarto();
        Spock spock = new Spock();
        assertEquals(lagarto, juego.jugar(spock, lagarto).getGanador());
    }

    @Test
    public void lagarto_contra_tijera() {
        Tijera tijera = new Tijera();
        Lagarto lagarto = new Lagarto();
        assertEquals(tijera, juego.jugar(lagarto, tijera).getGanador());
    }

    @Test
    public void lagarto_contra_papel() {
        Papel papel = new Papel();
        Lagarto lagarto = new Lagarto();
        assertEquals(lagarto, juego.jugar(lagarto, papel).getGanador());
    }

    @Test
    public void lagarto_contra_piedra() {
        Piedra piedra = new Piedra();
        Lagarto lagarto = new Lagarto();
        assertEquals(piedra, juego.jugar(lagarto, piedra).getGanador());
    }

    @Test
    public void lagarto_contra_spock() {
        Spock spock = new Spock();
        Lagarto lagarto = new Lagarto();
        assertEquals(lagarto, juego.jugar(lagarto, spock).getGanador());
    }

    @Test
    public void lagarto_contra_lagarto() {
        Lagarto lagarto = new Lagarto();
        Lagarto lagarto2 = new Lagarto();
        assertNull(juego.jugar(lagarto2, lagarto).getGanador());
    }
}
