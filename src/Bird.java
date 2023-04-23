public abstract class Bird extends Animal{
    private int heightOfFlight;

    public Bird(String name, int age, int heightOfFlight) {
        super(name, age);
        this.heightOfFlight = heightOfFlight;
    }

    public int getHeightOfFlight() {
        return heightOfFlight;
    }
}
