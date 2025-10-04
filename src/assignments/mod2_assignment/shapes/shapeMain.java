package assignments.mod2_assignment.shapes;

class circle implements Shape {
    private double l;
    double b = 3.14;

    @Override
    public double area(double l, double b) {
        return b*l*l;
    }
    @Override
    public double perimeter(double l, double b) {
        return 2*b*l;
    }

}
class rectangle implements Shape {
    private double l;
    private double b;

    @Override
    public double area(double l, double b) {
        return l*b;
    }
    @Override
    public double perimeter(double l, double b) {
        return 2*l*b;
    }
}
public class shapeMain {
    public static void main(String[] args) {
        circle circle = new circle();
        rectangle rectangle = new rectangle();
        System.out.println("circle's area: " + (circle.area(4,3.14)));
        System.out.println("rectangle's area: " + (rectangle.area(4,5)));
        System.out.println("circle's perimeter: " + (circle.perimeter(4,3.14)));
        System.out.println("rectangle's perimeter: " + (rectangle.perimeter(4,5)));
    }
}
