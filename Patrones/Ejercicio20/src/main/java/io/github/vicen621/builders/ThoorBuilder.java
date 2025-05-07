package io.github.vicen621.builders;

import io.github.vicen621.armors.IronArmor;
import io.github.vicen621.weapons.Stick;

public class ThoorBuilder extends CharacterBuilder {
    @Override
    public void addArmor() {
        character.setArmor(new IronArmor());
    }

    @Override
    public void addWeapon() {
        character.setWeapon(new Stick());
    }

    @Override
    public void addAbility() {
        character.setAbilities("rayos, combate a distancia");
    }
}
