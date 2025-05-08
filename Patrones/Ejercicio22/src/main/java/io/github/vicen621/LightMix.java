package io.github.vicen621;

public class LightMix extends ProcessStep {
    @Override
    protected boolean basicExecute(MixingTank tank) {
        double temp = tank.temperature();
        tank.heatPower(100);

        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (tank.temperature() - temp != 10)
            return false;

        tank.mixerPower(5);
        return true;
    }
}
