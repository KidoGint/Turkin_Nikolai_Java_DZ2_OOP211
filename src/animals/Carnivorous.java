package animals;

import food.Food;
import food.Grass;

public abstract class Carnivorous extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) System.out.println(super.getName() + " doesn't eat Grass");
        else {
            super.fullness += food.getSatiety();
            System.out.println(super.getName() + " is eating Meat");
        }
    }

}
