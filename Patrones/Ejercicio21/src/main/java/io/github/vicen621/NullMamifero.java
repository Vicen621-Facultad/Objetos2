package io.github.vicen621;

public class NullMamifero extends Mamifero {
    private static NullMamifero instance;

    private NullMamifero() {
        super.setIdentificador("NullMamifero");
    }

    public static NullMamifero getInstance() {
        if (instance == null)
            instance = new NullMamifero();

        return instance;
    }

    @Override
    public Mamifero getMadre() {
        return instance;
    }

    @Override
    public Mamifero getPadre() {
        return instance;
    }

    @Override
    public boolean tieneComoAncestroA(Mamifero unMamifero) {
        return false;
    }
}
