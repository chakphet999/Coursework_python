package babb;

public class Fish extends SeaAnimal{
    public Fish(String name){
        super(name);
    }
    @Override
    public void move(){
        System.out.println(name + " is swimming");
    }
}
