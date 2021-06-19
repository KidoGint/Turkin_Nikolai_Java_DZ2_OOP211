package animals;

import food.Food;

public class Fish extends Carnivorous implements Swim {
    private int fullness;

    public int getFullness() {
        return this.fullness;
    }

    @Override
    public void eat(Food food) {
        System.out.print("A Fish");
        super.eat(food);
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
