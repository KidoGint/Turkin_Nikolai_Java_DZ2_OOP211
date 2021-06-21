import animals.Animal;
import constants.Sizes;

import java.util.HashMap;


public class Aviary<AnimalType extends Animal> {
    private final Sizes size;
    private final HashMap<String, AnimalType> map = new HashMap<>();

    public Aviary() {
        this.size = Sizes.BIG;
    }

    public Aviary(Sizes size) {
        this.size = size;
    }

    public Sizes getSize() {
        return this.size;
    }

    public void addAnimal(AnimalType animal) {
        switch (this.size){
            case SMALL :
                if (animal.getSize()==Sizes.SMALL)
                    map.put(animal.getName(), animal);
                else System.out.println(animal.getName()+" is too big");
                break;
            case MEDIUM:
                if ((animal.getSize()==Sizes.SMALL)||(animal.getSize()==Sizes.MEDIUM))
                    map.put(animal.getName(), animal);
                else System.out.println(animal.getName()+" is too big");
                break;
            case LARGE:
                if (animal.getSize()!=Sizes.BIG)
                    map.put(animal.getName(), animal);
                else System.out.println(animal.getName()+" is too big");
                break;
            case BIG:
                map.put(animal.getName(), animal);
                break;
        }
    }

    public void deleteAnimal(AnimalType animal) {
        map.remove(animal.getName());
    }

    public AnimalType getAnimal(String animalName) {
        System.out.println(map.size());
        return map.get(animalName);

    }

}
