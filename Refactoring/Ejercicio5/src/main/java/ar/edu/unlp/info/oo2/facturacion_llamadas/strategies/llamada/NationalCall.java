package ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.llamada;

//TODO: magic numbers
public class NationalCall implements PrecioStrategy {

    public static final int PRECIO_POR_SEGUNDO = 3;

    @Override
    public double calcularPrecio(int duracion) {
        // el precio es de 3 pesos por segundo más IVA
        return duracion * PRECIO_POR_SEGUNDO + (duracion * PRECIO_POR_SEGUNDO * IVA);
    }
}
