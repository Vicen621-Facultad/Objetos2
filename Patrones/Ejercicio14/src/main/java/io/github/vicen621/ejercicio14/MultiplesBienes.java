package io.github.vicen621.ejercicio14;

import java.util.List;

public class MultiplesBienes extends Bien {
    private List<Bien> bienes;

    public MultiplesBienes(List<Bien> bienes) {
        super(.5);
        this.bienes = bienes;
    }

    @Override
    public double getValor() {
        return bienes.stream().map(Bien::getValor).reduce(0.0, Double::sum);
    }

    public void addChild(Bien child) {
        bienes.add(child);
    }

    public void removeChild(Bien child) {
        bienes.remove(child);
    }
}
