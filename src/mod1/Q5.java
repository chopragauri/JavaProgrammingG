package mod1;
public class Q5 {
static class Animal{
    public void sound(){
        System.out.println("animal undefined");
    }
}
static class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("dog barks");
    }
}
static class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("cat meOws");
    }
}
public static void main(String[] args) {
    Animal a = new Dog();
    a.sound();
    }
}
