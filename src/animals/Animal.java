package animals;

import food.Food;

public abstract class Animal {
    protected int fullness;
    public abstract void eat(Food food);
    public int getFullness() {
        return this.fullness;
    }
}
