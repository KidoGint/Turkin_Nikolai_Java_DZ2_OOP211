package animals;
import constants.Sizes;
public class Wolf extends Carnivorous implements Voice, Run, Swim {

    public Wolf(String name, int fullness, Sizes size) {
        super.fullness = fullness;
        super.name = name;
        super.size = size;
    }

    @Override
    public void run() {
        System.out.println(super.name + "is running");
    }

    @Override
    public void swim() {
        System.out.println(super.name + "is swimming");
    }

    @Override
    public String voice() {
        return "woof";
    }
}
