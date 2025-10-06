package labExp.Oct6;
interface Shape {
    abstract double calculateArea();
}
class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
class Rectangle implements Shape {
    double x;
    double y;
    Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public double calculateArea() {
        return x*y;
    }
}
public class Q2 {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(2.0, 2.0);
        shapes[2] = new Circle(6.0);
        shapes[3] = new Rectangle(2.0, 2.0);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + " area: " + shapes[i].calculateArea());
        }
    }
}