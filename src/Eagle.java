public class Eagle extends Bird implements Hunter{
    private String eagleSpecialty;

    public Eagle(String name, int age, int heightOfFlight, String eagleSpecialty) {
        super(name, age, heightOfFlight);
        this.eagleSpecialty = eagleSpecialty;
    }

    @Override
    public void show(){
        System.out.println(getName() + "," + getAge() + "," + getHeightOfFlight() + "," + eagleSpecialty);
    }
    @Override
    public void hunt(Prey prey){
        System.out.println(getName()+" hunted "+ prey.getName());
    }
}
