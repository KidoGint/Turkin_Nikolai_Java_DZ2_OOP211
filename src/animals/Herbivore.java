package animals;

import food.Food;
import food.Meat;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) System.out.println(super.getName() + " doesn't eat Meat");
        else {
            super.fullness += food.getSatiety();
            System.out.println(super.getName() + " is eating Grass");
        }
    }
}
