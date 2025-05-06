package io.github.vicen621.builder;

public interface Builder<T> {
    void reset();
    Builder<T> addCreacion();
    Builder<T> addExtension();
    Builder<T> addModificacion();
    Builder<T> addNombre();
    Builder<T> addPermisos();
    Builder<T> addTamanio();
    T getResult();
}
