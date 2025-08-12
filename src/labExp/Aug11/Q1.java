package labExp.Aug11;

class Vehicle {
    void displayType(){
        System.out.println("Generic Vehicle");
    }
}
    class Car extends Vehicle {
        @Override
        void displayType(){
            System.out.println("Car");
        }
    }

public class Q1{
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.displayType();
    }
}


