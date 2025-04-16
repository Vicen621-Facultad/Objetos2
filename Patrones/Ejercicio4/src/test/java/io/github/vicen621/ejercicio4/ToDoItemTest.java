package io.github.vicen621.ejercicio4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoItemTest {

    private ToDoItem item;

    @BeforeEach
    void setUp() {
        item = new ToDoItem("Tarea de prueba");
    }

    @Test
    void testInitialStateIsPending() {
        assertThrows(RuntimeException.class, () -> item.workedTime());
    }

    @Test
    void testStartFromPendingMovesToInProgress() {
        item.start();
        assertInstanceOf(InProgressState.class, item.getState());
    }

    @Test
    void testStartWhenNotPendingDoesNothing() {
        item.start();
        item.start(); // debería no hacer nada
        assertInstanceOf(InProgressState.class, item.getState());
    }

    @Test
    void testTogglePauseFromInProgressMovesToPaused() {
        item.start();
        item.togglePause(); // debería estar pausado
        assertInstanceOf(PausedState.class, item.getState());
    }

    @Test
    void testTogglePauseFromPausedMovesToInProgress() {
        item.start();
        item.togglePause(); // pausado
        item.togglePause(); // vuelve a in-progress
        assertInstanceOf(InProgressState.class, item.getState());
    }

    @Test
    void testTogglePauseFromPendingThrows() {
        assertThrows(RuntimeException.class, () -> item.togglePause());
    }

    @Test
    void testTogglePauseFromFinishedThrows() {
        item.start();
        item.finish();
        assertThrows(RuntimeException.class, () -> item.togglePause());
    }

    @Test
    void testFinishFromInProgress() {
        item.start();
        item.finish();
        assertInstanceOf(FinishedState.class, item.getState());
    }

    @Test
    void testFinishFromPaused() {
        item.start();
        item.togglePause();
        item.finish();
        assertInstanceOf(FinishedState.class, item.getState());
    }

    @Test
    void testFinishFromPendingDoesNothing() {
        item.finish(); // no hace nada
        assertInstanceOf(PendingState.class, item.getState());
    }

    @Test
    void testAddCommentInPending() {
        item.addComment("Comentario");
        assertEquals(1, item.getComments().size());
        // No deberíamos lanzar excepción
    }

    @Test
    void testAddCommentInFinishedDoesNothing() {
        item.start();
        item.finish();
        item.addComment("No se debería agregar");
        assertEquals(0, item.getComments().size());
        // No se lanza excepción, pero tampoco se agrega
    }

    @Test
    void testWorkedTimeWhileRunning() {
        item.start();
        assertDoesNotThrow(() -> item.workedTime());
    }

    @Test
    void testWorkedTimeWhenFinished() {
        item.start();
        item.finish();
        Duration worked = item.workedTime();
        assertNotNull(worked);
        assertFalse(worked.isNegative());
    }

    @Test
    void testWorkedTimeThrowsIfNeverStarted() {
        assertThrows(RuntimeException.class, () -> item.workedTime());
    }
}
