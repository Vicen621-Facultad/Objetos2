package ar.edu.unlp.info.oo2.facturacion_llamadas.builder;

public interface Builder {
    void reset();
    void setNombre(String nombre);
    void setTipo();
    void setNumeroTelefono(String numeroTelefono);
    void setDNI(String dni);
    void setCuit(String cuit);
    void setDescuento();
}
