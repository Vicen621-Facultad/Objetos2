package io.github.vicen621.ejercicio4;

import java.time.Duration;

public class PendingState implements ToDoState {
    @Override
    public void start(ToDoItem item) {
        item.setState(new InProgressState());
    }

    @Override
    public void togglePause(ToDoItem item) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    public void finish(ToDoItem item) { }

    @Override
    public Duration workedTime(ToDoItem item) {
        throw new RuntimeException("No se puede calcular el tiempo trabajado en el estado pendiente");
    }

    @Override
    public void addComment(ToDoItem item, String comment) {
        item.addCommentStates(comment);
    }
}
