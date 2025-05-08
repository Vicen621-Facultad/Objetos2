package io.github.vicen621.decorators;

import java.time.LocalDate;

public abstract class AbstractDecorator implements IFile {
    private IFile inner;
    private final String SEPARATOR = " - ";

    public AbstractDecorator(IFile inner) {
        this.inner = inner;
    }

    @Override
    public String getNombre() {
        return inner.getNombre();
    }

    @Override
    public String getExtension() {
        return inner.getExtension();
    }

    @Override
    public int getTamanio() {
        return inner.getTamanio();
    }

    @Override
    public LocalDate getCreacion() {
        return inner.getCreacion();
    }

    @Override
    public LocalDate getModificacion() {
        return inner.getModificacion();
    }

    @Override
    public String getPermisos() {
        return inner.getPermisos();
    }

    @Override
    public String prettyPrint() {
        return String.join(SEPARATOR, inner.prettyPrint(), printComponent());
    }

    protected abstract String printComponent();
}
