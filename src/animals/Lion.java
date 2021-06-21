package animals;
import constants.Sizes;

public class Lion extends Carnivorous implements Voice, Run {

    public Lion(String name, int fullness, Sizes size) {
        super.fullness = fullness;
        super.name = name;
        super.size = size;
    }

    @Override
    public void run() {
        System.out.println(super.name + "is running");
    }

    @Override
    public String voice() {
        return "woof";
    }
}
