package io.github.vicen621.ejercicio12;

import java.util.List;

public class FileSystem {
    private IFile root;

    public FileSystem(IFile root) {
        this.root = root;
    }

    public int totalSizeOcuped() {
        return root.getSize();
    }

    public File getBiggestFile() {
        return root.getBiggestFile();
    }

    public File getNewestFile() {
        return root.getNewestFile();
    }

    public IFile search(String name) {
        return root.search(name);
    }

    public List<IFile> searchAll(String name) {
        return root.searchAll(name);
    }

    public String listContent() {
        return root.listContent();
    }
}
