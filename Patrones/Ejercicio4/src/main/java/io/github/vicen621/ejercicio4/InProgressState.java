package io.github.vicen621.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InProgressState implements ToDoState {
    @Override
    public void start(ToDoItem item) { }

    @Override
    public void togglePause(ToDoItem item) {
        item.setState(new PausedState());
    }

    @Override
    public void finish(ToDoItem item) {
        item.setState(new FinishedState(item));
    }

    @Override
    public Duration workedTime(ToDoItem item) {
        return Duration.ofDays(ChronoUnit.DAYS.between(item.getStartTime(), LocalDate.now()));
    }

    @Override
    public void addComment(ToDoItem item, String comment) {
        item.addCommentStates(comment);
    }
}
