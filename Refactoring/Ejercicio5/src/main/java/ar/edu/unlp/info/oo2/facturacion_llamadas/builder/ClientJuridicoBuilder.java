package ar.edu.unlp.info.oo2.facturacion_llamadas.builder;

public class ClientJuridicoBuilder extends AbstractClientBuilder{
    @Override
    public void setTipo() {
        cliente.setTipo("juridica");
    }

    @Override
    public void setDescuento() {
        cliente.setDescuento(0.15);
    }

    @Override
    public void setDNI(String dni) {

    }

    @Override
    public void setCuit(String cuit) {
        cliente.setCuit(cuit);
    }
}
