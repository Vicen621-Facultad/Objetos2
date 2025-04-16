package io.github.vicen621.ejercicio4;

import java.time.Duration;

public interface ToDoState {
    void start(ToDoItem item);
    void togglePause(ToDoItem item);
    void finish(ToDoItem item);
    Duration workedTime(ToDoItem item);
    void addComment(ToDoItem item, String comment);
}
