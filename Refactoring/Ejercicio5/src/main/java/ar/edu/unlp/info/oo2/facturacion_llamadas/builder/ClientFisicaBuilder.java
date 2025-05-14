package ar.edu.unlp.info.oo2.facturacion_llamadas.builder;

public class ClientFisicaBuilder extends AbstractClientBuilder {
    @Override
    public void setDescuento() {
        cliente.setDescuento(0);
    }

    @Override
    public void setTipo() {
        cliente.setTipo("fisica");
    }

    @Override
    public void setDNI(String dni) {
        cliente.setDNI(dni);
    }

    @Override
    public void setCuit(String cuit) {

    }
}
