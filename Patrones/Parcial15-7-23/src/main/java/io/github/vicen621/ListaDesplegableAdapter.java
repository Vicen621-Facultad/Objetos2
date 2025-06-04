package io.github.vicen621;

public class ListaDesplegableAdapter extends AbstractEtiqueta {
    private ListaDesplegable adaptee;

    public ListaDesplegableAdapter(ListaDesplegable adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
        adaptee.setStyle(estilo.getEstiloEtiqueta());
    }

    @Override
    public String imprimir() {
        return adaptee.print();
    }
}
