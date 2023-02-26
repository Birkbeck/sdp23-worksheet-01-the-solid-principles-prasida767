public class Penguin implements SwimmingBirds, FeatheredBirds, Bird {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}
