package shape;
public class circle implements Shape{
    private double l;
    double b=3.14;

    @Override
    public double area(double l, double b) {
        return b*l*l;
    }
    @Override
    public double perimeter(double l, double b) {
        return 2*b*l;
    }

}
