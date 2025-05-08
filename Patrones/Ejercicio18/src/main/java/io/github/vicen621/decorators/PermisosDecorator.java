package io.github.vicen621.decorators;

public class PermisosDecorator extends AbstractDecorator {
    public PermisosDecorator(IFile inner) {
        super(inner);
    }

    @Override
    public String printComponent() {
        return getPermisos();
    }
}
