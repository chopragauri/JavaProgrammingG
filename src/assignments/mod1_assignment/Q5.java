package assignments.mod1_assignment;
//import mod1.Animal;
//import mod1.Dog;
class Animals{
    void sound(){
        System.out.println("generic animal sound");
    }
}
class dog extends Animals{
    @Override
    void sound(){
        System.out.println("dog barks");
    }
}
public class Q5 {
public static void main(String[] args) {
    Animals a = new dog();
    a.sound();
    }
}
