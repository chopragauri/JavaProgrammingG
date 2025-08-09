package mod2_assignment;
import java.util.Arrays;
import java.util.logging.*;

class InvalidAgeException1 extends Exception {
    public InvalidAgeException1(String message) {
        super(message);
    }
}

public class Q9 {
    private static final Logger logger = Logger.getLogger(Q9.class.getName());

    static {
        try {
            FileHandler fh = new FileHandler("age_log.txt", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setUseParentHandlers(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age " + age + " is not eligible.");
        System.out.println("Age " + age + " is eligible.");
    }

    public static void main(String[] args) {
        Arrays.asList(16, 20).forEach(age -> {
            try {
                checkAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Caught: " + e.getMessage());
                logger.warning(e.getMessage());
            }
        });
    }
}
