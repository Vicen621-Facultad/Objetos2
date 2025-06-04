package io.github.vicen621;

public class Etiqueta extends AbstractEtiqueta {
    protected String text;
    protected String estilo;

    public Etiqueta(String text) {
        this.text = text;
    }

    @Override
    public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
        this.estilo = estilo.getEstiloEtiqueta();
    }

    @Override
    public String imprimir() {
        return "<etiqueta estilo=\"" + this.estilo + "\"/> " + this.text + " </etiqueta>\n";
    }
}
