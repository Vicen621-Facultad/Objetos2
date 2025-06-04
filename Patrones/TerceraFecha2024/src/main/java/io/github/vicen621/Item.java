package io.github.vicen621;

public class Item extends iItem {

    public Item(String nombre, int espacioOcupado) {
        super(nombre, espacioOcupado);
    }

    @Override
    public boolean agregarItem(iItem item) {
        return false;
    }

    @Override
    public Bolsa buscarBolsaMasGrande() {
        return null;
    }

    @Override
    public iItem buscarItem(String nombre) {
        return null;
    }

    @Override
    public int capacidadDisponible() {
        return 0;
    }

    @Override
    public int getCapacidad() {
        return 0;
    }

    @Override
    public int getCapacidadDisponible() {
        return 0;
    }
}
