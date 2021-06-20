package animals;

public class Camal extends Herbivore implements Voice, Run {

    public Camal(String name, int fullness) {
        super.fullness = fullness;
        super.name = name;
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
