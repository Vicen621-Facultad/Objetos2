package io.github.vicen621.decorators;

public class ExtensionDecorator extends AbstractDecorator {
    public ExtensionDecorator(IFile inner) {
        super(inner);
    }

    @Override
    public String printComponent() {
        return getExtension();
    }
}
