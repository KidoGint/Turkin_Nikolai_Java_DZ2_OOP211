import animals.*;
import food.Banana;
import food.Meat;
import food.Steak;

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
        Steak steak = new Steak( 40);
        Banana banana = new Banana(10);
        worker.feed(camal, steak);
        worker.feed(camal, banana);
        worker.getVoice(camal);

        worker.feed(lion, steak);
        worker.feed(lion, banana);
        worker.getVoice(lion);

        worker.feed(zebra, steak);
        worker.feed(zebra, banana);
        worker.getVoice(zebra);

        worker.feed(wolf, steak);
        worker.feed(wolf, banana);
        worker.getVoice(wolf);

        for (int i = 5; i < 10; i++) {
            worker.getVoice((Voice) pool[i]);
        }
        for (int i = 0; i < 10; i++) {
            worker.feed((Animal) pool[i], steak);
            worker.feed((Animal) pool[i], banana);
            pool[i].swim();

        }
    }
}
