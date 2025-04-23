package io.github.vicen621.ejercicio13;

public class Sandwich {
    private double pan;
    private double aderezo;
    private double principal;
    private double adicional;

    public double getPrice() {
        return pan + aderezo + principal + adicional;
    }

    public double getPan() {
        return pan;
    }

    public double getAderezo() {
        return aderezo;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setPan(double pan) {
        this.pan = pan;
    }

    public void setAderezo(double aderezo) {
        this.aderezo = aderezo;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
}
