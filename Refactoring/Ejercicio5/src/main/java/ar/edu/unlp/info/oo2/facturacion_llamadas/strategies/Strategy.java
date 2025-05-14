package ar.edu.unlp.info.oo2.facturacion_llamadas.strategies;

import java.util.SortedSet;

public interface Strategy {
    String obtenerNumeroDisponible(SortedSet<String> lineas);
}
