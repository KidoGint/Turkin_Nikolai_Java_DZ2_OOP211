package animals;

import food.Food;
import food.Meat;

public class Lion extends Carnivorous implements Voice, Run {
    private String name;

    public Lion(String name, int fullness) {
        super.fullness = fullness;
        this.name = name;
    }

    @Override
    public void eat(Food food) {
        System.out.print("A Lion");
        super.eat(food);
        if (food instanceof Meat) this.fullness += food.getSatiety();
    }

    @Override
    public void run() {
        System.out.println(this.name + "is running");
    }

    @Override
    public String voice() {
        return "woof";
    }
}
