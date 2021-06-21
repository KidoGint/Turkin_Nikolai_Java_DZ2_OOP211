package animals;

import exceptions.WrongFoodException;
import food.Food;
import food.Grass;

public abstract class Carnivorous extends Animal {

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            throw new WrongFoodException(super.getName() + " doesn't eat Grass");
        } else {
            super.fullness += food.getSatiety();
            System.out.println(super.getName() + " is eating Meat");
        }
    }

}
