package mod1_assignment;

    public class Q14 {
        public static void main(String[] args) {
            int a = 10;
            int b = 5;
            String operation = "multiply";

            if (a > b) {
                System.out.println("a is greater than b.");
            } else {
                System.out.println("b is greater than or equal to a.");
            }

            switch (operation) {
                case "add":
                    System.out.println("Sum = " + (a + b));
                    break;
                case "subtract":
                    System.out.println("Difference = " + (a - b));
                    break;
                case "multiply":
                    System.out.println("Product = " + (a * b));
                    break;
                case "divide":
                    if (b != 0)
                        System.out.println("Quotient = " + (a / b));
                    else
                        System.out.println("Cannot divide by zero!");
                    break;
                default:
                    System.out.println("Invalid operation.");
            }

            System.out.println("\nMultiplication table of " + a + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(a + " x " + i + " = " + (a * i));
            }
        }
    }

