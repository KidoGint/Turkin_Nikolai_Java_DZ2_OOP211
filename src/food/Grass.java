package food;

public abstract class Grass extends Food {

    @Override
    public int getSatiety() {
        return this.satiety;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
