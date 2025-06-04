import io.github.vicen621.Bolsa;
import io.github.vicen621.Item;
import io.github.vicen621.Jugador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JugadorTest {

    private Jugador jugador;

    @BeforeEach
    public void setup() {
        jugador = new Jugador("test", new Bolsa(10));
    }

    @Test
    public void test() {
        assertTrue(jugador.agregarItem(new Item("item3", 3)));
        assertTrue(jugador.agregarItem(new Bolsa(13)));
        assertFalse(jugador.agregarItem(new Item("item30", 30)));
    }
}
