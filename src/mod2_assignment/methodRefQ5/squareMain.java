package mod2_assignment.methodRefQ5;

public class squareMain {
    public static double findSquare(int n) {
        return n * n;
    }
    public static void main(String[] args) {
        int x = 8;
        Square num = n -> n * n;
        System.out.println("Square (lambda): " + num.compute(x));
    }
}
