package animals;

import constants.Sizes;

public class Camal extends Herbivore implements Voice, Run {

    public Camal(String name, int fullness, Sizes size) {
        super.fullness = fullness;
        super.name = name;
        super.size = size;
    }

    @Override
    public String voice() {
        return "meeee";
    }

    @Override
    public void run() {
        System.out.println(super.name + " is running");
    }
}
