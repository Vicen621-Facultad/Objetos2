package ar.edu.unlp.oo2.persitencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PostRepositoryTest {

	@Test
	public void testFindPostsByUsername() {
		PostRepository postRepository = new PostRepository();
		
		assertEquals(2 , postRepository.findPostsByUsername("jane_smith").size());
		assertTrue(postRepository.findPostsByUsername("jane_smith").stream()
				.anyMatch(post -> post.getText().equals("Hoy es un gran día.")));
		assertTrue(postRepository.findPostsByUsername("jane_smith").stream()
				.anyMatch(post -> post.getText().equals("Compartiendo algunas fotos del viaje reciente.")));
		
		assertEquals(1 , postRepository.findPostsByUsername("john_doe").size());
		assertTrue(postRepository.findPostsByUsername("john_doe").stream()
				.anyMatch(post -> post.getText().equals("¡Acabo de publicar mi primer post!")));
	}

}
