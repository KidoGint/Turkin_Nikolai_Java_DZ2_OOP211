package animals;

public class Fish extends Carnivorous implements Swim {

    public Fish(String name, int fullness){
        super.fullness = fullness;
        super.name = name;
    }
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
