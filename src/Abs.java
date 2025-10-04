abstract class Animal {
    void makeSound() {
    }
}
class CAT extends Animal {
    @Override
    void makeSound() {
        System.out.println("meows");
    }
}
public class Abs {
    public static void main(String[] args) {
        Animal cat= new CAT();
        cat.makeSound();
    }
}
