package io.github.vicen621;

public abstract class iItem {
    private String nombre;
    private int espacioOcupado;

    public iItem(String nombre, int espacioOcupado) {
        this.nombre = nombre;
        this.espacioOcupado = espacioOcupado;
    }

    public abstract boolean agregarItem(iItem item);
    public abstract Bolsa buscarBolsaMasGrande();
    public abstract iItem buscarItem(String nombre);
    public abstract int capacidadDisponible();
    public abstract int getCapacidad();
    public abstract int getCapacidadDisponible();

    public int getEspacioOcupado() {
        return espacioOcupado;
    }

    public String getNombre() {
        return this.nombre;
    }
}
