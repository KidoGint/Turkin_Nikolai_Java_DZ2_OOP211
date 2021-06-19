package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {
    private int fullness;

    public abstract int getFullness();

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) System.out.println(" doesn't eat Meal");
        else {
            this.fullness += food.getSatiety();
            System.out.println(" is eating Grass");
        }
    }
}
