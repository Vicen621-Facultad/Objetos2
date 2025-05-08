package io.github.vicen621;

import io.github.vicen621.tanks.FakeMixingTankFailure;
import io.github.vicen621.tanks.FakeMixingTankSuccess;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LightMixTest {

    private LightMix mix;

    @BeforeEach
    public void setUp() {
        mix = new LightMix();
    }

    @Test
    public void testLightMixSuccess() {
        mix.execute(new FakeMixingTankSuccess());
        assertTrue(mix.isDone());
    }

    @Test
    public void testLightMixFailure() {
        mix.execute(new FakeMixingTankFailure());
        assertFalse(mix.isDone());
    }
}
