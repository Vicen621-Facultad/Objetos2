package ar.edu.unlp.info.oo2.facturacion_llamadas.builder;

public class Director {
    public void createClient(Builder builder, String nombre, String data, String telefono) {
        builder.reset();
        builder.setNombre(nombre);
        builder.setDNI(data);
        builder.setCuit(data);
        builder.setNumeroTelefono(telefono);
        builder.setTipo();
        builder.setDescuento();
    }
}
