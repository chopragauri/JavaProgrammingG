package mod2_assignment;
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Q10 {
    static int factorial(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException(
                    "Cannot calculate factorial of a negative number: " + n
            );
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int[] numbers = {5, -3}; // Java 8 style — array loop

        for (int num : numbers) {
            try {
                System.out.println("Factorial of " + num + " is: " + factorial(num));
            } catch (NegativeNumberException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }

        System.out.println("Program continues after handling exceptions.");
    }
}