package io.github.vicen621;

import io.github.vicen621.strategies.DisplayStrategy;
import io.github.vicen621.strategies.NullDisplayComponent;

import java.time.LocalDate;

public class FileOO2 {
    private String nombre;
    private String extension;
    private int tamanio;
    private LocalDate creacion;
    private LocalDate modificacion;
    private String permisos;
    private DisplayStrategy strategy;

    public FileOO2(String nombre, String extension, String permisos) {
        this.nombre = nombre;
        this.extension = extension;
        this.permisos = permisos;
        this.tamanio = 0;
        this.creacion = LocalDate.now();
        this.modificacion = LocalDate.now();
        this.strategy = new NullDisplayComponent();
    }

    public String prettyPrint() {
        return strategy.prettyPrint(this);
    }

    public void setStrategy(DisplayStrategy strategy) {
        this.strategy = strategy;
    }

    public String getNombre() {
        return nombre;
    }

    public String getExtension() {
        return extension;
    }

    public int getTamanio() {
        return tamanio;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public LocalDate getModificacion() {
        return modificacion;
    }

    public String getPermisos() {
        return permisos;
    }
}
