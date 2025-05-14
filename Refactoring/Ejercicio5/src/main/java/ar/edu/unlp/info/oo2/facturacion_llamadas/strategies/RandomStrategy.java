package ar.edu.unlp.info.oo2.facturacion_llamadas.strategies;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class RandomStrategy implements Strategy {

    @Override
    public String obtenerNumeroDisponible(SortedSet<String> lineas) {
        String linea = new ArrayList<>(lineas)
                .get(new Random().nextInt(lineas.size()));
        lineas.remove(linea);
        return linea;
    }
}
