package animals;

import food.Food;

public abstract class Animal {
    protected String name;
    protected int fullness;

    public String getName() {
        return this.name;
    }

    public abstract void eat(Food food);

    public int getFullness() {
        return this.fullness;
    }
}
