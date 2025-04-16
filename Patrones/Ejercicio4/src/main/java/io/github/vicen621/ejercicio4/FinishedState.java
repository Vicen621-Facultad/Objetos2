package io.github.vicen621.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FinishedState implements ToDoState {
    private LocalDate endTime;

    public FinishedState() {
        endTime = LocalDate.now();
    }

    @Override
    public void start(ToDoItem item) { }

    @Override
    public void togglePause(ToDoItem item) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    public void finish(ToDoItem item) { }

    @Override
    public Duration workedTime(ToDoItem item) {
        return Duration.ofDays(ChronoUnit.DAYS.between(item.getStartTime(), endTime));
    }

    @Override
    public void addComment(ToDoItem item, String comment) { }
}
