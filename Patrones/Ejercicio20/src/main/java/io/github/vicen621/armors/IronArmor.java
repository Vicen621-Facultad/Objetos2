package io.github.vicen621.armors;

public class IronArmor implements Armor {
    @Override
    public int getDamageFromSword() {
        return 5;
    }

    @Override
    public int getDamageFromBow() {
        return 3;
    }

    @Override
    public int getDamageFromStick() {
        return 1;
    }
}
