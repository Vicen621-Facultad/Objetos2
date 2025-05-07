package io.github.vicen621;

import io.github.vicen621.builders.Builder;

public class Director {
    public void buildCharacter(Builder builder) {
        builder.addArmor();
        builder.addWeapon();
        builder.addAbility();
    }
}
