package ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.llamada;

public class NationalCall implements PrecioStrategy {
    @Override
    public double calcularPrecio(int duracion) {
        // el precio es de 3 pesos por segundo más IVA
        return duracion * 3 + (duracion * 3 * 0.21);
    }
}
