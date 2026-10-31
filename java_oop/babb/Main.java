package babb;

public class Main {
    public static void main(String[] args) {

        SeaAnimal[] animals = new SeaAnimal[3];

        animals[0] = new Fish("Nemo");
        animals[1] = new Octopus("Inky");
        

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
    }
}