package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Llamada {
	private String tipoDeLlamada;
	private String origen;
	private String destino;
	private int duracion;

	public Llamada(String tipoLlamada, String origen, String destino, int duracion) {
		this.tipoDeLlamada = tipoLlamada;
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
		double aux = 0;
		if (getTipoDeLlamada() == "nacional") {
			// el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
			aux += getDuracion() * 3 + (getDuracion() * 3 * 0.21);
		} else if (getTipoDeLlamada() == "internacional") {
			// el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
			aux += getDuracion() * 150 + (getDuracion() * 150 * 0.21) + 50;
		}
		return aux;
	}
}
