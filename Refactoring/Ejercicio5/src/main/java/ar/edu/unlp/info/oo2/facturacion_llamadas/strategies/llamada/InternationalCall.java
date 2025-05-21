package ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.llamada;

public class InternationalCall implements PrecioStrategy {

    public static final int PRECIO_POR_SEGUNDO = 150;
    public static final int PRECIO_POR_ESTABLECER = 50;

    @Override
    public double calcularPrecio(int duracion) {
        // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
        return duracion * PRECIO_POR_SEGUNDO + (duracion * PRECIO_POR_SEGUNDO * IVA) + PRECIO_POR_ESTABLECER;
    }
}
