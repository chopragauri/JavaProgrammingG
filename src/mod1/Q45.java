package mod1;
final class Calculator {
    public final int square(int num) {
        return num * num;
    }
    public int cube(int num) {
        return num * num * num;
    }
}

// class AdvancedCalculator extends Calculator {} THROWS ERROR
public class Q45 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num = 5;

        System.out.println("Square of " + num + ": " + calc.square(num));
        System.out.println("Cube of " + num + ": " + calc.cube(num));
    }
}
