package animals;

import constants.Sizes;
import exceptions.WrongFoodException;
import food.Food;

import java.util.Objects;

public abstract class Animal {
    protected Sizes size;
    protected String name;
    protected int fullness;

    public String getName() {
        return this.name;
    }

    public Sizes getSize() {
        return this.size;
    }

    public abstract void eat(Food food)  throws WrongFoodException;

    public int getFullness() {
        return this.fullness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return fullness == animal.fullness && size == animal.size && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name, fullness);
    }
}
