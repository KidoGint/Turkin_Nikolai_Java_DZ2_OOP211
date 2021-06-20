package animals;

import food.Food;
import food.Grass;

public abstract class Carnivorous extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) System.out.println(" doesn't eat Grass");
        else {
            System.out.println(" is eating Meat");
        }
    }

}
