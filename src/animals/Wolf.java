package animals;

import food.Food;

public class Wolf extends Carnivorous implements Voice, Run, Swim {
    private final String name;

    public Wolf(String name, int fullness) {
        super.fullness = fullness;
        this.name = name;
    }

    @Override
    public void eat(Food food) {
        System.out.print("A Wolf");
        super.eat(food);
    }

    @Override
    public void run() {
        System.out.println(this.name + "is running");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "is swimming");
    }

    @Override
    public String voice() {
        return "woof";
    }
}
