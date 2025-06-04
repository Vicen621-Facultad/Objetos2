package io.github.vicen621;

public class Boton extends AbstractEtiqueta {
    protected String text;
    protected String estilo;
    private String accion;

    public Boton(String text, String accion) {
        this.text = text;
        this.accion = accion;
    }

    @Override
    public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
        this.estilo = estilo.getEstiloBoton();
    }

    @Override
    public String imprimir() {
        return "<boton estilo=\"" + this.estilo + "\" texto=\"" + this.text + "\" accion=\"" + this.accion + "\"/>\n";
    }
}
