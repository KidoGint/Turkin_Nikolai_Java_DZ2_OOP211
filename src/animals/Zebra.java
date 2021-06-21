package animals;

import constants.Sizes;

public class Zebra extends Herbivore implements Voice, Run {

    public Zebra(String name, int fullness, Sizes size) {
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
        return "Neigh!!!";
    }
}
