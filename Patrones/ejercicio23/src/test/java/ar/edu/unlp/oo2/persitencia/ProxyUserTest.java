package ar.edu.unlp.oo2.persitencia;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProxyUserTest {

    @Test
    public void testPostsAreNotLoadedOnCreation() {
        SpyPostRepository spy = new SpyPostRepository();
        // No se llamó a getPosts todavía
        assertFalse(spy.wasMethodCalled());
    }

    @Test
    public void testPostsAreLoadedOnFirstAccess() {
        SpyPostRepository spy = new SpyPostRepository();
        ProxyUser proxyUser = new ProxyUser("john_doe", "john.doe@example.com", spy);

        List<Post> posts = proxyUser.getPosts();

        assertTrue(spy.wasMethodCalled());
        assertEquals("john_doe", spy.getUsernameUsed());
        assertEquals(1, posts.size());
        assertTrue(posts.stream()
        	.anyMatch(post -> post.getText().equals("¡Acabo de publicar mi primer post!")));
    }

    @Test
    public void testPostsAreNotLoadedAgainOnSecondAccess() {
        SpyPostRepository spy = new SpyPostRepository();
        ProxyUser proxyUser = new ProxyUser("juan", "juan@mail.com", spy);

        proxyUser.getPosts(); // primera vez (debería cargar)
        spy = new SpyPostRepository(); // reiniciamos el spy (simula que el repo real no se vuelve a usar)
        proxyUser.getPosts(); // segunda vez

        assertFalse(spy.wasMethodCalled()); // no debería llamarse de nuevo
    }
}
