package io.github.vicen621;

public class Jugador {
    private String nombre;
    private Bolsa bolsa;

    public Jugador(String nombre, Bolsa bolsa) {
        this.nombre = nombre;
        this.bolsa = bolsa;
    }

    public boolean agregarItem(iItem item) {
        return bolsa.agregarItem(item);
    }

    public Bolsa buscarBolsaMasGrande() {
        return bolsa.buscarBolsaMasGrande();
    }

    public int capacidadDisponible() {
        return bolsa.capacidadDisponible();
    }
}
