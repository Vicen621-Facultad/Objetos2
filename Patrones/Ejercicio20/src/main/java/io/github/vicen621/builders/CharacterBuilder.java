package io.github.vicen621.builders;

import io.github.vicen621.Character;

public abstract class CharacterBuilder implements Builder {
    protected Character character;

    public CharacterBuilder() {
        reset();
    }

    @Override
    public void reset() {
        character = new Character();
    }

    public Character getCharacter() {
        Character result = character;
        reset();
        return result;
    }
}
