package io.github.vicen621.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Elemento implements Topografia {

    private float proporcionAgua;

    public Elemento(float proporcionAgua) {
        this.proporcionAgua = proporcionAgua;
    }

    @Override
    public float proporcionAgua() {
        return proporcionAgua;
    }

    @Override
    public float proporcionTierra() {
        return 1 - proporcionAgua;
    }

    @Override
    public void addChild(Topografia child) {
        throw new UnsupportedOperationException("Una hoja no puede agregar hijos");
    }

    @Override
    public void removeChild(Topografia child) {
        throw new UnsupportedOperationException("Una hoja no puede eliminar hijos");
    }

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
        return obj instanceof Elemento other && this.equals(other);
    }
}
