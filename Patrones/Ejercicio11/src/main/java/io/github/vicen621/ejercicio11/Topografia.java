package io.github.vicen621.ejercicio11;

import java.util.List;

public interface Topografia {
    float proporcionAgua();
    float proporcionTierra();
    void addChild(Topografia child);
    void removeChild(Topografia child);
    List<Topografia> getChilds();
    boolean equals(Topografia other);
}
