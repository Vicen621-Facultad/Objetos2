package io.github.vicen621.decorators;

import java.time.LocalDate;

public interface IFile {
    String getNombre();
    String getExtension();
    int getTamanio();
    LocalDate getCreacion();
    LocalDate getModificacion();
    String getPermisos();
    String prettyPrint();
}
