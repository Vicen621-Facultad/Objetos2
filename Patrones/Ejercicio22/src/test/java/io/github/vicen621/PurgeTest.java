package io.github.vicen621;

import io.github.vicen621.tanks.FakeMixingTankFailure;
import io.github.vicen621.tanks.FakeMixingTankSuccess;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PurgeTest {
    private Purge purge;

    @BeforeEach
    public void setUp() {
        purge = new Purge();
    }

    @Test
    public void testLightMixSuccess() {
        purge.execute(new FakeMixingTankSuccess());
        assertTrue(purge.isDone());
    }

    @Test
    public void testLightMixFailure() {
        purge.execute(new FakeMixingTankFailure());
    }
}
