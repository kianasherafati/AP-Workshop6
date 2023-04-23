import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Giraffe giraffe = new Giraffe("Giraffe",20,10,"Tallest");
        Cheetah cheetah = new Cheetah("Cheetah",15,100,"Fastest");
        Eagle eagle = new Eagle("Eagle",13,100,"Best Eyesight");
        Parrot parrot = new Parrot("Parrot",2,4,"Can Speak");
        ArrayList<Animal> jungle = new ArrayList<>();
        jungle.add(cheetah);
        jungle.add(parrot);
        jungle.add(eagle);
        jungle.add(giraffe);
        for(Animal animal : jungle){
            animal.show();
        }
        eagle.hunt(parrot);
    }
    }