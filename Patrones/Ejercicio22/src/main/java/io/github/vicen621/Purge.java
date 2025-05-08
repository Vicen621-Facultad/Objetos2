package io.github.vicen621;

public class Purge extends ProcessStep {
    @Override
    protected boolean basicExecute(MixingTank tank) {
        if (tank.upTo() == 0)
            return false;

        tank.heatPower(0);
        tank.mixerPower(0);
        tank.purge();

        try {
            Thread.sleep(4*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return tank.upTo() == 0;
    }
}
