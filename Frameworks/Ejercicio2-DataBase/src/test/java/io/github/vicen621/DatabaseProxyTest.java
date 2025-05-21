package io.github.vicen621;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseProxyTest {

    @Test
    public void testGetSearchResultsSinLoginDevuelveNull() {
        DatabaseRealAccess db = new DatabaseRealAccess();
        Authenticator auth = new Authenticator(); // no login
        DatabaseProxy proxy = new DatabaseProxy(db, auth);

        Collection<String> resultado = proxy.getSearchResults("select * from comics where id=1");
        assertNull(resultado, "Debe devolver null si no está autenticado");
    }

    @Test
    public void testInsertNewRowSinLoginDevuelveMenosUno() {
        DatabaseRealAccess db = new DatabaseRealAccess();
        Authenticator auth = new Authenticator(); // no login
        DatabaseProxy proxy = new DatabaseProxy(db, auth);

        int resultado = proxy.insertNewRow(Arrays.asList("Iron Man", "Marvel"));
        assertEquals(-1, resultado, "Debe devolver -1 si no está autenticado");
    }

    @Test
    public void testGetSearchResultsConLoginDevuelveDatosCorrectos() {
        DatabaseRealAccess db = new DatabaseRealAccess();
        Authenticator auth = new Authenticator();
        auth.login("admin", "1234"); // login exitoso
        DatabaseProxy proxy = new DatabaseProxy(db, auth);

        Collection<String> resultado = proxy.getSearchResults("select * from comics where id=1");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), resultado);
    }

    @Test
    public void testInsertNewRowConLoginInsertaCorrectamente() {
        DatabaseRealAccess db = new DatabaseRealAccess();
        Authenticator auth = new Authenticator();
        auth.login("admin", "1234"); // login exitoso
        DatabaseProxy proxy = new DatabaseProxy(db, auth);

        int nuevoId = proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
        assertEquals(3, nuevoId);

        Collection<String> nuevoResultado = proxy.getSearchResults("select * from comics where id=3");
        assertEquals(Arrays.asList("Patoruzú", "La flor"), nuevoResultado);
    }
}
