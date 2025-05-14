package ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.numeros;

import java.util.SortedSet;

public interface NumerosStrategy {
    String obtenerNumeroDisponible(SortedSet<String> lineas);
}
