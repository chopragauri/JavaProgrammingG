package labExp.Aug11;
public class Q7 {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3};
            try {
                System.out.println("Accessing index 5: " + numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
            System.out.println("Program continues after exception handling.");
        }
}
