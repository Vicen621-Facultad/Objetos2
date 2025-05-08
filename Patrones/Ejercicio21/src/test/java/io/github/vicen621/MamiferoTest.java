package io.github.vicen621;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MamiferoTest {
	private Mamifero nala;
	private Mamifero melquiades;
	private Mamifero mufasa;
	private Mamifero alexa;
	private Mamifero elsa;
	private Mamifero scar;
	private Mamifero sarabi;
	private Mamifero anonimo;

	@BeforeEach
	void setUp() {
		nala = new Mamifero("Nala");
		melquiades = new Mamifero("Melquiades");
		mufasa = new Mamifero("Mufasa");
		alexa = new Mamifero("Alexa");
		elsa = new Mamifero("Elsa");
		scar = new Mamifero("Scar");
		sarabi = new Mamifero("Sarabi");
		anonimo = new Mamifero("anonimo");

		alexa.setPadre(mufasa);
		alexa.setMadre(sarabi);
		mufasa.setPadre(melquiades);
		mufasa.setMadre(nala);
		sarabi.setPadre(scar);
		sarabi.setMadre(elsa);
	}

	@Test
	void testAbuelaMaterna() {
		assertEquals(elsa, alexa.getAbuelaMaterna());
		assertEquals(NullMamifero.getInstance(), sarabi.getAbuelaMaterna());
		assertEquals(NullMamifero.getInstance(), elsa.getAbuelaMaterna());
	}

	@Test
	void testAbuelaPaterna() {
		assertEquals(nala, alexa.getAbuelaPaterna());
		assertEquals(NullMamifero.getInstance(), mufasa.getAbuelaPaterna());
		assertEquals(NullMamifero.getInstance(), nala.getAbuelaPaterna());
	}

	@Test
	void testAbueloMaterno() {
		assertEquals(scar, alexa.getAbueloMaterno());
		assertEquals(NullMamifero.getInstance(), sarabi.getAbueloMaterno());
		assertEquals(NullMamifero.getInstance(), scar.getAbueloMaterno());
	}

	@Test
	void testAbueloPaterno() {
		assertEquals(melquiades, alexa.getAbueloPaterno());
		assertEquals(NullMamifero.getInstance(), mufasa.getAbueloPaterno());
		assertEquals(NullMamifero.getInstance(), melquiades.getAbueloPaterno());
	}

	@Test
	void testEspecie() {
		anonimo.setEspecie("Panthera leo");
		assertEquals("Panthera leo", anonimo.getEspecie());
	}

	@Test
	void testIdentificador() {
		anonimo.setIdentificador("Nala");
		assertEquals("Nala", anonimo.getIdentificador());
	}

	@Test
	void testMadre() {
		anonimo.setMadre(alexa);
		assertEquals(alexa, anonimo.getMadre());
		assertEquals(NullMamifero.getInstance(), nala.getMadre());
	}

	@Test
	void testPadre() {
		anonimo.setPadre(mufasa);
		assertEquals(mufasa, anonimo.getPadre());
		assertEquals(NullMamifero.getInstance(), nala.getPadre());
	}

	@Test
	void testTieneComoAncestroA() {
		assertFalse(nala.tieneComoAncestroA(anonimo));
		assertFalse(mufasa.tieneComoAncestroA(anonimo));
		assertFalse(alexa.tieneComoAncestroA(anonimo));
		assertFalse(alexa.tieneComoAncestroA(alexa));
		assertTrue(alexa.tieneComoAncestroA(mufasa));
		assertTrue(alexa.tieneComoAncestroA(sarabi));
		assertTrue(alexa.tieneComoAncestroA(nala));
		assertTrue(alexa.tieneComoAncestroA(melquiades));
		assertTrue(alexa.tieneComoAncestroA(elsa));
		assertTrue(alexa.tieneComoAncestroA(scar));
	}

	@Test
	void testTieneComoAncestroAsimetrico() {
		// Alice -> Aaron -> Anna -> Alexander
		Mamifero alice = new Mamifero("Alice");
		Mamifero aaron = new Mamifero("Aaron");
		Mamifero anna = new Mamifero("Anna");
		Mamifero alexander = new Mamifero("Alexander");

		alice.setPadre(aaron);
		aaron.setMadre(anna);
		anna.setPadre(alexander);

		assertTrue(alice.tieneComoAncestroA(anna));
		assertTrue(alice.tieneComoAncestroA(aaron));
		assertTrue(alice.tieneComoAncestroA(alexander));
		assertFalse(alice.tieneComoAncestroA(nala));
		assertFalse(alice.tieneComoAncestroA(alice));
	}
}