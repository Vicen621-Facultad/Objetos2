package io.github.vicen621;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Componente> componentes;

    public Catalogo() {
        componentes = new ArrayList<>();
    }

    public Componente getComponente(String descripcion) {
        return componentes.stream()
                .filter(comp -> comp.getDescripcion().startsWith(descripcion))
                .findFirst()
                .orElse(null);
    }

    public void addComponente(Componente componente) {
        componentes.add(componente);
    }

    public void removeComponente(Componente componente) {
        componentes.remove(componente);
    }
}
