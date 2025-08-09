package mod2_assignment.shapes;

public class rectangle implements Shape {
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
