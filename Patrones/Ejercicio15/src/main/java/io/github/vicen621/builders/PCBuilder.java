package io.github.vicen621.builders;

import io.github.vicen621.Componente;
import io.github.vicen621.PC;

public class PCBuilder implements Builder {
    private PC pc;

    public PCBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.pc = new PC();
    }

    @Override
    public void setProcesador(Componente procesador) {
        pc.addChild(procesador);
    }

    @Override
    public void setRam(Componente ram) {
        pc.addChild(ram);
    }

    @Override
    public void setDisco(Componente disco) {
        pc.addChild(disco);
    }

    @Override
    public void setGrafica(Componente grafica) {
        pc.addChild(grafica);
    }

    @Override
    public void setGabinete(Componente gabinete) {
        pc.addChild(gabinete);
    }

    @Override
    public void setFuente(Componente fuente) {
        pc.addChild(fuente);
    }

    @Override
    public double getConsumo() {
        return pc.getConsumo();
    }

    public PC getResult() {
        return pc;
    }
}
