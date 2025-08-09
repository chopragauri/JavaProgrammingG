package labExp;

class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
}
    public class lab3  {
        static int factorial(int n) throws NegativeNumberException {
            if (n < 0) {
                throw new NegativeNumberException("Cannot calculate factorial of a negative number: " + n);
            }
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
        public static void main(String[] args) {
            int num1 = 5;
            int num2 = -3;
            try {
                System.out.println("factorial of " + num1 + " is: " + factorial(num1));
                System.out.println("factorial of " + num2 + " is: " + factorial(num2));
            } catch (NegativeNumberException e) {
                System.out.println("exception caught: " + e.getMessage());
            }
            System.out.println("prog continues after handling exceptions.");
        }
}
