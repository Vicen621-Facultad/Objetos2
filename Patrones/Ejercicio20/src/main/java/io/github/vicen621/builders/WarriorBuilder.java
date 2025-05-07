package io.github.vicen621.builders;

import io.github.vicen621.armors.IronArmor;
import io.github.vicen621.armors.SteelArmor;
import io.github.vicen621.weapons.Sword;

public class WarriorBuilder extends CharacterBuilder {
    @Override
    public void addArmor() {
        character.setArmor(new SteelArmor());
    }

    @Override
    public void addWeapon() {
        character.setWeapon(new Sword());
    }

    @Override
    public void addAbility() {

    }
}
