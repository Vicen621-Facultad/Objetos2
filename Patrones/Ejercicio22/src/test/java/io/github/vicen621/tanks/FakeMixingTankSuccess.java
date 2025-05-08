package io.github.vicen621.tanks;

import io.github.vicen621.MixingTank;

public class FakeMixingTankSuccess extends MixingTank {
    private double temperature = 100;
    private double liquid = 100;

    @Override
    public boolean heatPower(int percentage) {
        return true;
    }

    @Override
    public boolean mixerPower(int percentage) {
        return true;
    }

    @Override
    public boolean purge() {
        liquid = 0;
        return true;
    }

    @Override
    public double upTo() {
        return liquid;
    }

    @Override
    public double temperature() {
        var aux = temperature;
        temperature -= 10;
        return aux;
    }
}
