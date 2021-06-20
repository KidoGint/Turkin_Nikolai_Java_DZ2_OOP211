package animals;

public class Lion extends Carnivorous implements Voice, Run {

    public Lion(String name, int fullness) {
        super.fullness = fullness;
        super.name = name;
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
