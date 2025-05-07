package io.github.vicen621.builders;

import io.github.vicen621.armors.LeatherArmor;
import io.github.vicen621.weapons.Bow;

public class ArcherBuilder extends CharacterBuilder {
    @Override
    public void addArmor() {
        character.setArmor(new LeatherArmor());
    }

    @Override
    public void addWeapon() {
        character.setWeapon(new Bow());
    }

    @Override
    public void addAbility() {

    }
}
