public abstract class Mammal extends Animal {
    private int speed;

    public Mammal(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
