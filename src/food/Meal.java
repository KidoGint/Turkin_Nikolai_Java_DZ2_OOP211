package food;

public class Meal extends Food {
    private final int satiety;
    private final String name;

    public Meal(String name, int satiety) {
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
