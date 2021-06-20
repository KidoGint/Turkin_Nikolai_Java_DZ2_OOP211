package animals;

public class Zebra extends Herbivore implements Voice, Run {

    public Zebra(String name, int fullness) {
        super.fullness = fullness;
        super.name = name;
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
