package io.github.vicen621.ejercicio12;

import java.time.LocalDate;
import java.util.List;

public interface IFile {
    String getName();
    int getSize();
    LocalDate getCreationDate();
    File getBiggestFile();
    File getNewestFile();
    IFile search(String name);
    List<IFile> searchAll(String name);
    String listContent();
    void addChild(IFile file);
    void removeChild(IFile file);
    List<IFile> getChilds();
}
