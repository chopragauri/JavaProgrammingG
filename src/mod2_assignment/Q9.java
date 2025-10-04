package mod2_assignment;
import java.util.Arrays;
import java.util.logging.*;

public class Q9 {
    private static final Logger logger = Logger.getLogger(Q9.class.getName());

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age " + age + " is not eligible.");
        System.out.println("Age " + age + " is eligible.");
    }

    public static void main(String[] args) {
            try{
                checkAge(15);
            } catch (InvalidAgeException e) {
                System.out.println("Caught: " + e.getMessage());
                logger.warning(e.getMessage());
            }
        };


class InvalidAgeException1 extends Exception {
        public InvalidAgeException1(String message) {
            super(message);
        }
    }
}
