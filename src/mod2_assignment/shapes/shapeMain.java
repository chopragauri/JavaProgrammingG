package mod2_assignment.shapes;

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
