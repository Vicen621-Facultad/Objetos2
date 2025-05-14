package ar.edu.unlp.info.oo2.facturacion_llamadas;

import ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.numeros.LastNumerosStrategy;
import ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.numeros.NumerosStrategy;

import java.util.TreeSet;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<>();
	private NumerosStrategy strategy = new LastNumerosStrategy();

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		return strategy.obtenerNumeroDisponible(lineas);
	}

	public void cambiarTipoGenerador(NumerosStrategy valor) {
		this.strategy = valor;
	}
}
