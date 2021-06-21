package animals;
import constants.Sizes;
public class Duck extends Herbivore implements Voice, Fly, Swim, Run {

    public Duck(String name, int fullness, Sizes size) {
        super.fullness = fullness;
        super.name = name;
        super.size = size;
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void run() {
        System.out.println("Duck is running");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public String voice() {
        return "quack quack";
    }
}
