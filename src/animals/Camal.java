package animals;

import food.Food;

public class Camal extends Herbivore implements Voice, Run {
    private final String name;
    private final int fullness;

    public Camal(String name, int fullness) {
        this.fullness = fullness;
        this.name = name;
    }

    @Override
    public void eat(Food food) {
        System.out.print("A Camal");
        super.eat(food);
    }

    @Override
    public int getFullness() {
        return this.fullness;
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
