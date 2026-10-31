package Zoo;
import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(){
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal a){
        animals.add(a);
    }
    public void showAllAnimals(){
        System.out.println(animals);
    }
    public void makeAllSounds(){
        for (Animal a : animals){
            a.makeSound();
        }
    }
}
