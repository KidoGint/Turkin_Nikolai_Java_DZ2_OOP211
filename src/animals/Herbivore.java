package animals;

import exceptions.WrongFoodException;
import food.Food;
import food.Meat;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            throw new WrongFoodException(super.getName() + " doesn't eat Meat");
        }
        else {
            super.fullness += food.getSatiety();
            System.out.println(super.getName() + " is eating Grass");
        }
    }
}
