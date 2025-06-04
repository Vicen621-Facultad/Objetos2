package io.github.vicen621;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Bolsa extends iItem {
    private List<iItem> items;
    private int capacidad;

    public Bolsa(int capacidad) {
        super("bolsa", 1);
        this.items = new ArrayList<>();
        this.capacidad = capacidad;
    }

    @Override
    public boolean agregarItem(iItem item) {
        if (this.items.size() + item.getEspacioOcupado() <= this.capacidad) {
            return this.items.add(item);
        }

        return this.items.stream().anyMatch(item2 -> item2.agregarItem(item));
    }

    @Override
    public Bolsa buscarBolsaMasGrande() {
        if (this.items.isEmpty()) {
            return this;
        }

        return this.items.stream()
                .map(iItem::buscarBolsaMasGrande)
                .filter(Objects::nonNull)
                .max(Comparator.comparingInt(iItem::getCapacidad))
                .orElse(null);

    }

    @Override
    public iItem buscarItem(String nombre) {
        return this.items.stream()
                .filter(item -> item.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    @Override
    public int capacidadDisponible() {
        return this.getCapacidadDisponible() + items.stream().mapToInt(iItem::getCapacidadDisponible).sum();
    }

    @Override
    public int getCapacidadDisponible() {
        return this.capacidad - this.items.size();
    }

    public int getCapacidad() {
        return capacidad;
    }
}
