package animals;

import food.*;

public class Camal extends Herbivore implements Voice, Run {
    private String name;

    public Camal(String name, int fullness) {
        super.fullness = fullness;
        this.name = name;
    }

    @Override
    public void eat(Food food) {
        System.out.print("A Camal");
        super.eat(food);
        if (food instanceof Grass) this.fullness+=food.getSatiety();
    }

    @Override
    public String voice() {
        return "meeee";
    }

    @Override
    public void run() {
        System.out.println(this.name + " is running");
    }
}
