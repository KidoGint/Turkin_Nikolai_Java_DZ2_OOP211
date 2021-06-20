package animals;

import food.Food;
import food.Meat;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) System.out.println(" doesn't eat Meat");
        else {
            System.out.println(" is eating Grass");
        }
    }
}
