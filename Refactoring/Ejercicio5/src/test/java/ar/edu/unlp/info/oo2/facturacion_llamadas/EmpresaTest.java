package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.llamada.InternationalCall;
import ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.llamada.NationalCall;
import ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.numeros.FirstNumerosStrategy;
import ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.numeros.RandomNumerosStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {
	Empresa sistema;

	@BeforeEach
	public void setUp() {
		this.sistema = new Empresa();
		this.sistema.agregarNumeroTelefono("2214444554");
		this.sistema.agregarNumeroTelefono("2214444555");
		this.sistema.agregarNumeroTelefono("2214444556");
		this.sistema.agregarNumeroTelefono("2214444557");
		this.sistema.agregarNumeroTelefono("2214444558");
		this.sistema.agregarNumeroTelefono("2214444559");
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		Cliente emisorPersonaFisca = sistema.registrarUsuario("11555666", "Brendan Eich" , "fisica");
		Cliente remitentePersonaFisica = sistema.registrarUsuario("00000001", "Doug Lea" , "fisica");
		Cliente emisorPersonaJuridica = sistema.registrarUsuario("17555222", "Nvidia Corp" , "juridica");
		Cliente remitentePersonaJuridica = sistema.registrarUsuario("25765432", "Sun Microsystems" , "juridica");

		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica, new NationalCall(), 10);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica, new InternationalCall(), 8);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica, new NationalCall(), 5);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica, new InternationalCall(), 7);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica, new NationalCall(), 15);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica, new InternationalCall(), 45);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica, new NationalCall(), 13);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica, new InternationalCall(), 17);

		assertEquals(11454.64, this.sistema.calcularMontoTotalLlamadas(emisorPersonaFisca), 0.01);
		assertEquals(2445.40, this.sistema.calcularMontoTotalLlamadas(emisorPersonaJuridica), 0.01);
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaFisica));
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaJuridica));
	}

	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 0);
		this.sistema.agregarNumeroTelefono("2214444558"); 
		Cliente nuevaPersona = this.sistema.registrarUsuario("2444555","Alan Turing", "fisica");

		assertEquals(1, this.sistema.cantidadDeUsuarios());
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
	}

	@Test
	void obtenerNumeroLibre() {
		// por defecto es el ultimo
		assertEquals("2214444559", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarTipoGenerador(new FirstNumerosStrategy());
		assertEquals("2214444554", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarTipoGenerador(new RandomNumerosStrategy());
		assertNotNull(this.sistema.obtenerNumeroLibre());
	}
}
