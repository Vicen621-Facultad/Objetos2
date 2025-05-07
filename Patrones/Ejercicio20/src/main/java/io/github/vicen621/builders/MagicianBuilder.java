package io.github.vicen621.builders;

import io.github.vicen621.armors.LeatherArmor;
import io.github.vicen621.weapons.Stick;

public class MagicianBuilder extends CharacterBuilder {

    @Override
    public void addArmor() {
        character.setArmor(new LeatherArmor());
    }

    @Override
    public void addWeapon() {
        character.setWeapon(new Stick());
    }

    @Override
    public void addAbility() {
        character.setAbilities("Magia, combate a distancia");
    }
}
