package io.github.vicen621.ejercicio13;

public class SandwichBuilder implements Builder {
    private Sandwich sandwich;

    @Override
    public void reset() {
        this.sandwich = new Sandwich();
    }

    @Override
    public void setPan(double price) {
        sandwich.setPan(price);
    }

    @Override
    public void setAderezo(double price) {
        sandwich.setAderezo(price);
    }

    @Override
    public void setPrincipal(double price) {
        sandwich.setPrincipal(price);
    }

    @Override
    public void setAdicional(double price) {
        sandwich.setAdicional(price);
    }

    public Sandwich getResult() {
        Sandwich result = sandwich;
        reset();
        return result;
    }
}
