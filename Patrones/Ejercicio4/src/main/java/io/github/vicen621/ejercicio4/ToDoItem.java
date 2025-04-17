package io.github.vicen621.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private String name;
    private ToDoState state;
    private LocalDate startTime;
    private LocalDate endTime;
    private List<String> comments;

    public ToDoItem(String name) {
        this.name = name;
        this.state = new PendingState();
        this.startTime = LocalDate.now();
        this.endTime = null;
        this.comments = new ArrayList<>();
    }

    /**
     * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
     * pending. Si se encuentra en otro estado, no hace nada.
     */
    public void start() {
        state.start(this);
    }

    /**
     * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
     * estado es paused. Caso contrario (pending o finished) genera un error
     * informando la causa específica del mismo.
     */
    public void togglePause() {
        state.togglePause(this);
    }

    /**
     * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
     * in-progress o paused. Si se encuentra en otro estado, no hace nada.
     */
    public void finish() {
        state.finish(this);
    }

    /**
     * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
     * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
     * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
     * genera un error informando la causa específica del mismo.
     */
    public Duration workedTime() {
        return state.workedTime(this);
    }

    /**
     * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
     * contrario no hace nada."
     */
    public void addComment(String comment) {
        state.addComment(this, comment);
    }

    /**
     * Agrega un comentario al ToDoItem.
     * Esta pensado para que lo usen solo los ToDoState
     * Por eso es protected
     */
    protected void addCommentStates(String comment) {
        comments.add(comment);
    }

    // Solo para ToDoState
    protected void setState(ToDoState state) {
        this.state = state;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    protected void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public List<String> getComments() {
        return comments;
    }

    // Only for testing
    public ToDoState getState() {
        return state;
    }
}
