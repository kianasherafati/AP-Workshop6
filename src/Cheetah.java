public class Cheetah extends Mammal implements Hunter{
    private String cheetahSpecialty;

    public Cheetah(String name, int age, int speed, String cheetahSpecialty) {
        super(name, age, speed);
        this.cheetahSpecialty = cheetahSpecialty;
    }

    @Override
    public void show(){
        System.out.println(getName() + "," + getAge() + "," + getSpeed() + "," + cheetahSpecialty);
    }
}
