package labExp.AUG4;

public class lab1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result (try-catch): " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error in try-catch: " + e.getMessage());
        }
        try {
            int result = a / b;
            System.out.println("Result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("error in try-catch-finally: " + e.getMessage());
        } finally {
            System.out.println("this is finally block. It runs no matter what.");
        }
        System.out.println("prog continues after error handling.");
    }
}
