package io.github.vicen621.weapons;

import io.github.vicen621.Character;

public class Sword implements Weapon {
    @Override
    public void attack(Character defender) {
        defender.receiveAttackFromSword();
    }
}
