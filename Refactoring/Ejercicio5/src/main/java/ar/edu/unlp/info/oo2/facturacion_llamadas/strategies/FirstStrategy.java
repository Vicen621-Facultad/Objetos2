package ar.edu.unlp.info.oo2.facturacion_llamadas.strategies;

import java.util.SortedSet;

public class FirstStrategy implements Strategy {
    @Override
    public String obtenerNumeroDisponible(SortedSet<String> lineas) {
        String linea = lineas.first();
        lineas.remove(linea);
        return linea;
    }
}
