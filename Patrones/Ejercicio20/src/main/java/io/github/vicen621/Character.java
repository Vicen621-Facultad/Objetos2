package io.github.vicen621;

import io.github.vicen621.armors.Armor;
import io.github.vicen621.weapons.Weapon;

public class Character {
    public static final int MAX_HEALTH = 100;

    private Armor armor;
    private Weapon weapon;
    private String abilities;
    private int health;

    public Character() {
        health = MAX_HEALTH;
    }

    public void attack(Character defender) {
        weapon.attack(defender);
    }

    public void damage(int amount) {
        health -= amount;
    }

    public void receiveAttackFromSword() {
        damage(armor.getDamageFromSword());
    }

    public void receiveAttackFromBow() {
        damage(armor.getDamageFromBow());
    }

    public void receiveAttackFromStick() {
        damage(armor.getDamageFromStick());
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public int getHealth() {
        return health;
    }
}
