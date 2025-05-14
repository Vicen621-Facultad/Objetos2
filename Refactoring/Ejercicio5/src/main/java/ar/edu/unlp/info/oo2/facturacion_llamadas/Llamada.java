package ar.edu.unlp.info.oo2.facturacion_llamadas;

import ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.llamada.PrecioStrategy;

public class Llamada {
	private String tipoDeLlamada;
	private String origen;
	private String destino;
	private int duracion;
	private PrecioStrategy strategy;

	public Llamada(PrecioStrategy tipoLlamada, String origen, String destino, int duracion) {
		this.strategy = tipoLlamada;
		this.origen= origen;
		this.destino= destino;
		this.duracion = duracion;
	}

	public String getTipoDeLlamada() {
		return tipoDeLlamada;
	}

	public String getRemitente() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getOrigen() {
		return origen;
	}

	public double calcularPrecio() {
		return strategy.calcularPrecio(getDuracion());
	}
}
