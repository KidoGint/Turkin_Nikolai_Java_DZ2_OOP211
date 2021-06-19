package animals;

import food.Food;

public class Lion extends Carnivorous implements Voice, Run {
    private final String name;
    private final int fullness;

    public Lion(String name, int fullness) {
        this.fullness = fullness;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void eat(Food food) {
        System.out.print("A Lion");
        super.eat(food);
    }

    @Override
    public void run() {
        System.out.println(this.name + "is running");
    }

    @Override
    public String voice() {
        return "woof";
    }

    @Override
    public int getFullness() {
        return this.fullness;
    }
}
