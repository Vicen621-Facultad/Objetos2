package io.github.vicen621;

import java.util.ArrayList;
import java.util.List;

public class Contenedor extends AbstractEtiqueta {
    private List<AbstractEtiqueta> childs;

    public Contenedor() {
        this.childs = new ArrayList<>();
    }

    public void addChild(AbstractEtiqueta child) {
        childs.add(child);
    }

    public void removeChild(AbstractEtiqueta child) {
        childs.remove(child);
    }

    @Override
    public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
        this.childs.forEach(child -> child.aplicarEstilo(estilo));
    }

    @Override
    public String imprimir() {
        StringBuilder builder = new StringBuilder();
        builder.append("<contenedor>\n");
        childs.forEach(child -> builder.append(child.imprimir()));
        builder.append("</contenedor>\n");
        return builder.toString();
    }
}
