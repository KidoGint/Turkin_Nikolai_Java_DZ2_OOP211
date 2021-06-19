package animals;

import food.Food;

public class Zebra extends Herbivore implements Voice, Run {
    private final String name;
    private final int fullness;

    public Zebra(String name, int fullness) {
        this.fullness = fullness;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getFullness() {
        return this.fullness;
    }

    @Override
    public void eat(Food food) {
        System.out.print("Zebra");
        super.eat(food);
    }

    @Override
    public void run() {
        System.out.println(this.name + "is running");
    }

    @Override
    public String voice() {
        return "Neigh!!!";
    }
}
