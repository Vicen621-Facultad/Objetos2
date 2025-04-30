package io.github.vicen621.builders;

import io.github.vicen621.Componente;

public interface Builder {
    void reset();
    void setProcesador(Componente procesador);
    void setRam(Componente ram);
    void setDisco(Componente disco);
    void setGrafica(Componente grafica);
    void setGabinete(Componente gabinete);
    void setFuente(Componente fuente);
    double getConsumo();
}
