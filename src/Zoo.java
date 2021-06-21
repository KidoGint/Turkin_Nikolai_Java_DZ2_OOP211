import animals.*;
import constants.Sizes;
import exceptions.WrongFoodException;
import food.Banana;
import food.Steak;

public class Zoo {
    public static void main(String[] args) throws WrongFoodException {
        Worker worker = new Worker();
        Camal camal = new Camal("Cama", 50, Sizes.BIG);
        Lion lion = new Lion("Leo", 40, Sizes.BIG);
        Zebra zebra = new Zebra("Zee", 60, Sizes.LARGE);
        Wolf wolf = new Wolf("Woo", 70, Sizes.MEDIUM);
        Swim[] pool = new Swim[10];
        for (int i = 0; i < 10; i++) {
            pool[i] = (i < 5) ? new Fish("Fishy №" + i, 10, Sizes.SMALL) : new Duck("Ducky №" + (i - 5), 15, Sizes.SMALL);
        }
        Steak steak = new Steak(40);
        Banana banana = new Banana(10);
        worker.feed(camal, banana);
        worker.getVoice(camal);

        worker.feed(lion, steak);
        worker.getVoice(lion);

        worker.feed(zebra, banana);
        worker.getVoice(zebra);

        worker.feed(wolf, steak);
        worker.getVoice(wolf);

        for (int i = 5; i < 10; i++) {
            worker.getVoice((Voice) pool[i]);
        }
        for (int i = 0; i < 10; i++) {
            worker.feed((Animal) pool[i], i < 5 ? steak : banana);
            pool[i].swim();

        }

        Aviary<Herbivore> cells1 = new Aviary<>();
        cells1.addAnimal(zebra);
        cells1.addAnimal((Duck) pool[6]);
        cells1.addAnimal((Duck) pool[7]);
        Aviary<Herbivore> cells2 = new Aviary<>(Sizes.MEDIUM);
        Aviary<Herbivore> cells3 = new Aviary<>(Sizes.BIG);
        cells2.addAnimal(camal);
        cells3.addAnimal(camal);

    }
}
