package ar.edu.unlp.info.oo2.facturacion_llamadas.strategies.numeros;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class RandomNumerosStrategy implements NumerosStrategy {

    @Override
    public String obtenerNumeroDisponible(SortedSet<String> lineas) {
        String linea = new ArrayList<>(lineas)
                .get(new Random().nextInt(lineas.size()));
        lineas.remove(linea);
        return linea;
    }
}
