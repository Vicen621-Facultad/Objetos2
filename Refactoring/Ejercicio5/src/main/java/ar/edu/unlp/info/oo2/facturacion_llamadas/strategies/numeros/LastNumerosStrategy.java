package ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.numeros;

import java.util.SortedSet;

//TODO: Template
public class LastNumerosStrategy implements NumerosStrategy {
    @Override
    public String obtenerNumeroDisponible(SortedSet<String> lineas) {
        String linea = lineas.last();
        lineas.remove(linea);
        return linea;
    }
}
