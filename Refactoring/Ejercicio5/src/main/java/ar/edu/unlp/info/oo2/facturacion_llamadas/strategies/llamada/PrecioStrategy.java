package ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.llamada;

public interface PrecioStrategy {
    double IVA = 0.21;

    double calcularPrecio(int duracion);
}
