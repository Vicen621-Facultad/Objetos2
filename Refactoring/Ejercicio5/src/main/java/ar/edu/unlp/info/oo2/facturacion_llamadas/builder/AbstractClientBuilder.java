package ar.edu.unlp.info.oo2.facturacion_llamadas.builder;

import ar.edu.unlp.info.oo2.facturacion_llamadas.Cliente;

public abstract class AbstractClientBuilder implements Builder {
    protected Cliente cliente;

    @Override
    public void reset() {
        cliente = new Cliente();
    }

    @Override
    public void setNombre(String nombre) {
        cliente.setNombre(nombre);
    }

    @Override
    public void setNumeroTelefono(String numeroTelefono) {
        cliente.setNumeroTelefono(numeroTelefono);
    }

    public Cliente getCliente() {
        Cliente aux = cliente;
        reset();
        return aux;
    }
}
