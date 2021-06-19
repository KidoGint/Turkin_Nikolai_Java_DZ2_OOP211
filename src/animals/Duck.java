package animals;

import food.Food;

public class Duck extends Herbivore implements Voice, Fly, Swim, Run {
    private int fullness;

    public int getFullness() {
        return this.fullness;
    }

    @Override
    public void eat(Food food) {
        System.out.print("A Duck");
        super.eat(food);
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
