package io.github.vicen621;

import java.util.ArrayList;
import java.util.List;

public class PC implements Producto {
    private List<Componente> componentes;

    public PC() {
        componentes = new ArrayList<>();
    }

    public double getPrecio() {
        return componentes.stream()
                .map(Componente::getPrecio)
                .reduce(0.0, Double::sum);
    }

    public double getConsumo() {
        return componentes.stream()
                .map(Componente::getConsumo)
                .reduce(0.0, Double::sum);
    }

    public void addChild(Componente componente) {
        componentes.add(componente);
    }
}
