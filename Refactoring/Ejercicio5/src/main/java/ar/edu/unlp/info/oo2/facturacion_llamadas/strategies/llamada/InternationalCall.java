package ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.llamada;

public class InternationalCall implements PrecioStrategy {
    @Override
    public double calcularPrecio(int duracion) {
        // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
        return duracion * 150 + (duracion * 150 * 0.21) + 50;
    }
}
