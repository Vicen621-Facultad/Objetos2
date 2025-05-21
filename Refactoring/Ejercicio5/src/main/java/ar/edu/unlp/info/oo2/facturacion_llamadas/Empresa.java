package ar.edu.unlp.info.oo2.facturacion_llamadas;

import ar.edu.unlp.info.oo2.facturacion_llamadas.builder.Builder;
import ar.edu.unlp.info.oo2.facturacion_llamadas.builder.ClientFisicaBuilder;
import ar.edu.unlp.info.oo2.facturacion_llamadas.builder.ClientJuridicoBuilder;
import ar.edu.unlp.info.oo2.facturacion_llamadas.builder.Director;
import ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.llamada.PrecioStrategy;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<>();
	// TODO: No se usa, habria que sacarla?
	private List<Llamada> llamadas = new ArrayList<>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	public boolean agregarNumeroTelefono(String str) {
		return guia.getLineas().add(str);
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}

	public Cliente registrarUsuario(String data, String nombre, String tipo) {
		Cliente var = null;
		String tel = this.obtenerNumeroLibre();
		// builder
		if (tipo.equals("fisica")) {
			ClientFisicaBuilder builder = new ClientFisicaBuilder();
			new Director().createClient(builder, nombre, data, tel);
			var = builder.getCliente();
		}
		else if (tipo.equals("juridica")) {
			ClientJuridicoBuilder builder = new ClientJuridicoBuilder();
			new Director().createClient(builder, nombre, data, tel);
			var = builder.getCliente();
		}

		clientes.add(var);
		return var;
	}

	public Llamada registrarLlamada(Cliente origen, Cliente destino, PrecioStrategy tipo, int duracion) {
		Llamada llamada = new Llamada(tipo, origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		llamadas.add(llamada);
		origen.getLlamadas().add(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
