package io.github.vicen621.armors;

public class LeatherArmor implements Armor {
    @Override
    public int getDamageFromSword() {
        return 8;
    }

    @Override
    public int getDamageFromBow() {
        return 5;
    }

    @Override
    public int getDamageFromStick() {
        return 2;
    }
}
