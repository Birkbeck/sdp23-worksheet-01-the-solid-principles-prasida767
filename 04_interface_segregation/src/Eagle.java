public class Eagle implements FlyingBirds, FeatheredBirds, Bird {
    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }
}
