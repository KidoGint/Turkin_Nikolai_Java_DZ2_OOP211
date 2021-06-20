package food;

public abstract class Meat extends Food {


    @Override
    public int getSatiety() {
        return this.satiety;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
