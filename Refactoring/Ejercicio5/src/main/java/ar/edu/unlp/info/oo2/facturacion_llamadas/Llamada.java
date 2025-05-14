package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Llamada {
    private final String tipoDeLlamada;
    private final String origen;
    private final String destino;
    private final int duracion;

    public Llamada(String tipoLlamada, String origen, String destino, int duracion) {
        this.tipoDeLlamada = tipoLlamada;
        this.origen = origen;
        this.destino = destino;
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
}
