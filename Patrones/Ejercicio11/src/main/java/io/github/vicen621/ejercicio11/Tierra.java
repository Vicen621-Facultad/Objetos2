package io.github.vicen621.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Tierra implements Topografia {
    @Override
    public float proporcionAgua() {
        return 0;
    }

    @Override
    public float proporcionTierra() {
        return 1;
    }

    @Override
    public void addChild(Topografia child) { }

    @Override
    public void removeChild(Topografia child) { }

    @Override
    public List<Topografia> getChilds() {
        return new ArrayList<>();
    }

    @Override
    public boolean equals(Topografia other) {
        return other.proporcionAgua() == this.proporcionAgua() && other.proporcionTierra() == this.proporcionTierra();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Tierra other && this.equals(other);
    }
}
