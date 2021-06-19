package food;

public class Grass extends Food {
    private final int satiety;
    private final String name;

    public Grass(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    @Override
    public int getSatiety() {
        return this.satiety;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
