package animals;

public class Wolf extends Carnivorous implements Voice, Run, Swim {

    public Wolf(String name, int fullness) {
        super.fullness = fullness;
        super.name = name;
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
