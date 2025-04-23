package io.github.vicen621.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Mixta implements Topografia {
    private List<Topografia> hijos;

    public Mixta() {
        this.hijos = new ArrayList<>();
    }

    @Override
    public float proporcionAgua() {
        return hijos.stream()
                     .map(Topografia::proporcionAgua)
                     .reduce(Float::sum)
                     .orElse(0f) / 4;
    }

    @Override
    public float proporcionTierra() {
        return hijos.stream()
                .map(Topografia::proporcionTierra)
                .reduce(Float::sum)
                .orElse(0f) / 4;
    }

    @Override
    public void addChild(Topografia child) {
        if (this.getChilds().size() == 4)
            return;

        this.hijos.add(child);
    }

    @Override
    public void removeChild(Topografia child) {
        this.hijos.remove(child);
    }

    @Override
    public List<Topografia> getChilds() {
        return hijos;
    }

    @Override
    public boolean equals(Topografia other) {
        return other.proporcionAgua() == this.proporcionAgua() &&
                other.proporcionTierra() == this.proporcionTierra()
                && other.getChilds().equals(this.getChilds());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Mixta other && this.equals(other);
    }
}
