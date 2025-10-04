package mod1_assignment;

class rectangle implements ShapeQ3 {
    @Override
    public double area(int l, int b) {
        return l* b;
    }
}
public class Q3 {
public static void main(String[] args) {
    rectangle a = new rectangle();
    System.out.println("area of rectangle: " +a.area(5,2) );
}
}
