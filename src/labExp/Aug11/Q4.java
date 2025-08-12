package labExp.Aug11;

abstract class Shape {
    abstract double area();

    void displayShape() {
        System.out.println("This is a shape");
    }
}
class Circle extends Shape {
    private double radius;
    void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    void setlw(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }
}

public class Q4 {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(5.0);
        circle.displayShape();
        System.out.println("Circle Area: " + circle.area());

        Rectangle rectangle = new Rectangle();
        rectangle.setlw(4.0,3);
        rectangle.displayShape();
        System.out.println("Rectangle Area: " + rectangle.area());
    }
}