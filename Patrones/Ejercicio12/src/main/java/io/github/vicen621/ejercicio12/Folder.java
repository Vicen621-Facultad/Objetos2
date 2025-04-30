package io.github.vicen621.ejercicio12;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Folder implements IFile {
    private String name;
    private LocalDate creationDate;
    private List<IFile> childs;

    public Folder(String name, LocalDate creationDate) {
        this.name = name;
        this.creationDate = creationDate;
        this.childs = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public LocalDate getCreationDate() {
        return this.creationDate;
    }

    @Override
    public int getSize() {
        return childs.stream().map(IFile::getSize).reduce(0, Integer::sum);
    }

    @Override
    public File getBiggestFile() {
        return childs.stream()
                .map(IFile::getBiggestFile) // pedimos a cada hijo su archivo más grande
                .filter(Objects::nonNull) // filtramos los nulos (por seguridad)
                .max(Comparator.comparingDouble(File::getSize)) // nos quedamos con el de mayor tamaño
                .orElse(null); // si no hay ninguno, devolvemos null
    }

    @Override
    public File getNewestFile() {
        return childs.stream()
                .map(IFile::getNewestFile) // pedimos a cada hijo su archivo más nuevo
                .filter(Objects::nonNull) // filtramos nulos
                .max(Comparator.comparing(File::getCreationDate)) // el más reciente
                .orElse(null); // si no hay ninguno, null
    }

    @Override
    public IFile search(String name) {
        Optional<IFile> optional = this.childs.stream()
                .filter(file -> file.getName().equals(name))
                .findFirst();

        if (optional.isPresent()) {
            return optional.get();
        }

        // Si no lo encuentra, busca recursivamente en los hijos
        for (IFile file : childs) {
            IFile found = file.search(name); // recursivo
            if (found != null) {
                return found;
            }
        }

        // No se encontró en ningún lado
        return null;
    }

    @Override
    public List<IFile> searchAll(String name) {
        return childs.stream()
                .flatMap(file -> {
                    List<IFile> matches = new ArrayList<>();

                    if (file.getName().equals(name)) {
                        matches.add(file);
                    }

                    matches.addAll(file.searchAll(name)); // recursión
                    return matches.stream();
                })
                .collect(Collectors.toList());

    }

    @Override
    public String listContent() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append("\n");

        for (IFile child : childs) {
            sb.append(child.listContent());
            sb.append("\n");
        }

        return sb.toString();
    }

    @Override
    public void addChild(IFile file) {
        this.childs.add(file);
    }

    @Override
    public void removeChild(IFile file) {
        this.childs.remove(file);
    }

    @Override
    public List<IFile> getChilds() {
        return this.childs;
    }
}
