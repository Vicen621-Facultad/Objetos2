package io.github.vicen621.decorators;

public class TamanioDecorator extends AbstractDecorator {

    public TamanioDecorator(IFile inner) {
        super(inner);
    }

    @Override
    public String printComponent() {
        return Integer.toString(getTamanio());
    }
}
