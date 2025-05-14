package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<>();
	private String tipoGenerador = "ultimo";
	private Strategy strategy = new Strategy();

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		return strategy.obtenerNumeroDisponible(lineas, tipoGenerador);
	}

	public void cambiarTipoGenerador(String valor) {
		this.tipoGenerador = valor;
	}
}
