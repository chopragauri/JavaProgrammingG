package mod1_assignment;
class Animal{
    void makeSound(){
        System.out.println("animal not defined");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("dog barks");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
    System.out.println("cat meOws");
    }
}
public class Q46 {
    public static void main(String[] args) {
        Animal cat=new Cat();
        Dog dog=new Dog();
        cat.makeSound();
        dog.makeSound();
    }
}
