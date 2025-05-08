package io.github.vicen621;

import java.time.LocalDate;

public class Mamifero {
    private String identificador;
    private String especie;
    private LocalDate fechaNacimiento;
    private Mamifero madre;
    private Mamifero padre;

    protected Mamifero() {}

    public Mamifero(String identificador) {
        this.identificador = identificador;
        this.fechaNacimiento = LocalDate.now();
        this.madre = NullMamifero.getInstance();
        this.padre = NullMamifero.getInstance();
    }

    public boolean tieneComoAncestroA(Mamifero unMamifero) {
        return getMadre().equals(unMamifero) ||
                getMadre().tieneComoAncestroA(unMamifero) ||
                getPadre().equals(unMamifero) ||
                getPadre().tieneComoAncestroA(unMamifero);
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Mamifero getMadre() {
        return madre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public Mamifero getPadre() {
        return padre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public Mamifero getAbueloMaterno() {
        return getMadre().getPadre();
    }

    public Mamifero getAbuelaMaterna() {
        return getMadre().getMadre();
    }

    public Mamifero getAbueloPaterno() {
        return getPadre().getPadre();
    }

    public Mamifero getAbuelaPaterna() {
        return getPadre().getMadre();
    }
}