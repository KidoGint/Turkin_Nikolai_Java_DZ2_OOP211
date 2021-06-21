package animals;
import constants.Sizes;
public class Fish extends Carnivorous implements Swim {

    public Fish(String name, int fullness, Sizes size){
        super.fullness = fullness;
        super.name = name;
        super.size = size;
    }
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
