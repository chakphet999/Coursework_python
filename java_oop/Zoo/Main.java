package Zoo;

public class Main {
    public static void main(String[] args) {
        
        // สร้าง Zoo
        Zoo zoo = new Zoo();
        
        // สร้างสัตว์
        Animal dog = new Dog("Lucky", 3);
        Animal cat = new Cat("Mimi", 2);
        
        // เพิ่มสัตว์เข้า Zoo
        zoo.addAnimal(dog);
        zoo.addAnimal(cat);
        
        // แสดงข้อมูลสัตว์ทั้งหมด
        zoo.showAllAnimals();
        
        System.out.println();
        
        // ให้สัตว์ทั้งหมดส่งเสียง
        zoo.makeAllSounds();
    }
}