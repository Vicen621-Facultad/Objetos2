package io.github.vicen621.ejercicio12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class File implements IFile {
    private String name;
    private int size;
    private LocalDate creationDate;

    public File(String name, int size, LocalDate creationDate) {
        this.name = name;
        this.size = size;
        this.creationDate = creationDate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public LocalDate getCreationDate() {
        return this.creationDate;
    }

    @Override
    public File getBiggestFile() {
        return this;
    }

    @Override
    public File getNewestFile() {
        return this;
    }

    @Override
    public IFile search(String name) {
        return this.name.equals(name) ? this : null;
    }

    @Override
    public List<IFile> searchAll(String name) {
        List<IFile> result = new ArrayList<>();
        if (this.name.equals(name)) {
            result.add(this);
        }
        return result;
    }

    @Override
    public String listContent() {
        return this.name;
    }

    @Override
    public void addChild(IFile file) {
        throw new UnsupportedOperationException("Only supported for directories");
    }

    @Override
    public void removeChild(IFile file) {
        throw new UnsupportedOperationException("Only supported for directories");
    }

    @Override
    public List<IFile> getChilds() {
        return new ArrayList<>();
    }
}
