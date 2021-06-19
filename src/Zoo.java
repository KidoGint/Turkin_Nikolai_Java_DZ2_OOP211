import animals.*;
import food.Grass;
import food.Meal;

public class Zoo {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Camal camal = new Camal("Cama", 50);
        Lion lion = new Lion("Leo", 40);
        Zebra zebra = new Zebra("Zee", 60);
        Wolf wolf = new Wolf("Woo", 70);
        Swim[] pool = new Swim[10];
        for (int i = 0; i < 10; i++) {
            pool[i] = (i < 5) ? new Fish() : new Duck();
        }
        Meal meal = new Meal("meat", 40);
        Grass grass = new Grass("grass", 10);
        worker.feed(camal, meal);
        worker.feed(camal, grass);
        worker.getVoice(camal);

        worker.feed(lion, meal);
        worker.feed(lion, grass);
        worker.getVoice(lion);

        worker.feed(zebra, meal);
        worker.feed(zebra, grass);
        worker.getVoice(zebra);

        worker.feed(wolf, meal);
        worker.feed(wolf, grass);
        worker.getVoice(wolf);

        for (int i = 5; i < 10; i++) {
            worker.getVoice((Voice) pool[i]);
        }
        for (int i = 0; i < 10; i++) {
            worker.feed((Animal) pool[i], meal);
            worker.feed((Animal) pool[i], grass);
            pool[i].swim();

        }
    }
}
