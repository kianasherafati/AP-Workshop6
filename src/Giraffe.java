public class Giraffe extends Mammal implements Prey{
    private String giraffeSpeciality;

    public Giraffe(String name, int age, int speed, String giraffeSpeciality) {
        super(name, age, speed);
        this.giraffeSpeciality = giraffeSpeciality;
    }

   @Override
    public void show(){
        System.out.println("name: " + getName() + ", " + "age: " + getAge() + ", " + "speed: " + getSpeed() + ", " +
               "\""+giraffeSpeciality+"\"");
    }
}
