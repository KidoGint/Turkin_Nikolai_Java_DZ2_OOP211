package animals;

import food.Food;
import food.Grass;

public class Duck extends Herbivore implements Voice, Fly, Swim, Run {
    @Override
    public void eat(Food food) {
        System.out.print("A Duck");
        super.eat(food);
        if (food instanceof Grass) super.fullness += food.getSatiety();
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void run() {
        System.out.println("Duck is running");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public String voice() {
        return "quack quack";
    }
}
