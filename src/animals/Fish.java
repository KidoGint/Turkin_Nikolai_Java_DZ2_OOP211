package animals;

import food.Food;
import food.Meat;

public class Fish extends Carnivorous implements Swim {
    @Override
    public void eat(Food food) {
        System.out.print("A Fish");
        super.eat(food);
        if (food instanceof Meat) super.fullness += food.getSatiety();
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
