package babb;

public class Octopus extends SeaAnimal{
    public Octopus(String name){
        super(name);
    }
    @Override
    public void move(){
        System.out.println(name + " is swimming");
    }
}
