public class Cheetah extends Mammal implements Hunter{
    private String cheetahSpecialty;

    public Cheetah(String name, int age, int speed, String cheetahSpecialty) {
        super(name, age, speed);
        this.cheetahSpecialty = cheetahSpecialty;
    }

    @Override
    public void show(){
        System.out.println("name: " + getName() + ", " + "age: " + getAge() + ", " + "speed: " + getSpeed() + ", " +
                "\""+cheetahSpecialty+"\"");
    }
    @Override
    public void hunt(Prey prey){
        System.out.println(getName()+" hunted "+ prey.getName());
    }
}
