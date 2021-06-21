import animals.Animal;
import animals.Voice;
import exceptions.WrongFoodException;
import food.Food;

public class Worker {
    public void feed(Animal animal, Food food)  throws WrongFoodException {
        animal.eat(food);
    }

    public void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }
}
