package mod2_assignment;

public class Q7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result (try-catch): " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error in try-catch: " + e.getMessage());
        }

        b = 2;

        try {
            int result = a / b; // This will succeed
            System.out.println("Result (try-catch-finally): " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error in try-catch-finally: " + e.getMessage());
        } finally {
            System.out.println("This is finally block. It runs no matter what.");
        }
        System.out.println("Program continues after error handling.");
    }
}