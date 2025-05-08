import io.github.vicen621.Character;
import io.github.vicen621.Director;
import io.github.vicen621.builders.ArcherBuilder;

public class test {
    @Test
    public void test() {
        ArcherBuilder builder = new ArcherBuilder();
        new Director().buildCharacter(builder);
        Character archer = builder.getCharacter();

        new DirectorArcher().buildCharacter(builder);

    }

    buildCharacter() {
        builder.setWeapon()
    }
}
