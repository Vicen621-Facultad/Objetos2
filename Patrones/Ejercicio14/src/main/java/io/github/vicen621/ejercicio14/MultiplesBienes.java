package io.github.vicen621.ejercicio14;

import javax.management.Query;
import javax.management.QueryExp;
import java.util.ArrayList;
import java.util.List;

public class MultiplesBienes extends Bien {
    private List<Bien> bienes;

    public MultiplesBienes(List<Bien> bienes) {
        super(.5);
        this.bienes = new ArrayList<>(bienes);
    }

    @Override
    public double getValor() {
        return bienes.stream().mapToDouble(Bien::getValor).sum();
    }

    public void addChild(Bien child) {
        bienes.add(child);
    }

    public void removeChild(Bien child) {
        bienes.remove(child);
    }
}
