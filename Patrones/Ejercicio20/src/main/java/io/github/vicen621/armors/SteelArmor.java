package io.github.vicen621.armors;

public class SteelArmor implements Armor {
    @Override
    public int getDamageFromSword() {
        return 3;
    }

    @Override
    public int getDamageFromBow() {
        return 2;
    }

    @Override
    public int getDamageFromStick() {
        return 1;
    }
}
