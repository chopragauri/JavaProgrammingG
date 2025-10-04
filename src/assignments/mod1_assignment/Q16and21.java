package assignments.mod1_assignment;

public class Q16and21 {
        static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
        public static void main(String[] args) {
            int a = 6;
            int result = factorial(a);
            System.out.println("factorial of " + a + " is: " + result);
        }
    }
