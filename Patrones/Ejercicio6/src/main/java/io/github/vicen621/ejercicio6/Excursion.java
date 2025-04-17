package io.github.vicen621.ejercicio6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
    private String nombre;
    private double precio;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private String puntoEncuentro;
    private int cupoMaximo;
    private int cupoMinimo;
    private List<User> inscriptos;
    private List<User> listaEspera;
    private ExcursionState state;

    public Excursion(String nombre, double precio, LocalDate fechaIni, LocalDate fechaFin, String puntoEncuentro, int cupoMinimo, int cupoMaximo) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.puntoEncuentro = puntoEncuentro;
        this.cupoMinimo = cupoMinimo;
        this.cupoMaximo = cupoMaximo;
        this.inscriptos = new ArrayList<>();
        this.listaEspera = new ArrayList<>();
        this.state = new BajoCupoMinimo();
    }

    public void inscribir(User usuario) {
        state.inscribirUsuario(usuario, this);
    }

    protected void inscribirState(User usuario) {
        this.inscriptos.add(usuario);
    }

    protected void inscribirListaEspera(User usuario) {
        this.listaEspera.add(usuario);
    }

    protected void setState(ExcursionState state) {
        this.state = state;
    }

    public String obtenerInformacion() {
        return state.obtenerInformacion(this);
    }

    public int getCantidadInscriptos() {
        return inscriptos.size();
    }

    public List<String> getMailsInscriptos() {
        return inscriptos.stream()
                .map(User::getEmail)
                .collect(Collectors.toList());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public void setPuntoEncuentro(String puntoEncuentro) {
        this.puntoEncuentro = puntoEncuentro;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getCupoMinimo() {
        return cupoMinimo;
    }

    public void setCupoMinimo(int cupoMinimo) {
        this.cupoMinimo = cupoMinimo;
    }

    public List<User> getListaEspera() {
        return listaEspera;
    }
}
