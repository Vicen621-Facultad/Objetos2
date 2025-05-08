package io.github.vicen621;

import io.github.vicen621.decorators.IFile;

import java.time.LocalDate;

public class FileOO2 implements IFile {
    private String nombre;
    private String extension;
    private int tamanio;
    private LocalDate creacion;
    private LocalDate modificacion;
    private String permisos;

    public FileOO2(String nombre, String extension, String permisos) {
        this.nombre = nombre;
        this.extension = extension;
        this.permisos = permisos;
        this.tamanio = 0;
        this.creacion = LocalDate.now();
        this.modificacion = LocalDate.now();
    }

    public String prettyPrint() {
        return this.getNombre();
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
