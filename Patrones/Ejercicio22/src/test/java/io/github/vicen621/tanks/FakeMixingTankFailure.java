package io.github.vicen621.tanks;

import io.github.vicen621.MixingTank;

public class FakeMixingTankFailure extends MixingTank {

    @Override
    public boolean heatPower(int percentage) {
        return false;
    }

    @Override
    public boolean mixerPower(int percentage) {
        return false;
    }

    @Override
    public boolean purge() {
        return false;
    }

    @Override
    public double upTo() {
        return 0;
    }

    @Override
    public double temperature() {
        return 0;
    }
}
