package io.github.vicen621.weapons;

import io.github.vicen621.Character;

public class Bow implements Weapon {
    @Override
    public void attack(Character defender) {
        defender.receiveAttackFromBow();
    }
}
