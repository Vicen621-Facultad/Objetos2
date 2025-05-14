package ar.edu.unlp.info.oo2.facturacion_llamadas;

import ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.LastStrategy;
import ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.Strategy;

import java.util.TreeSet;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<>();
	private Strategy strategy = new LastStrategy();

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		return strategy.obtenerNumeroDisponible(lineas);
	}

	public void cambiarTipoGenerador(Strategy valor) {
		this.strategy = valor;
	}
}
