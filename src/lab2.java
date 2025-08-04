class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class lab2 {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Access Denied - Age must be 18 or older.");
        } else {
            System.out.println("Access Granted - You are eligible.");
        }
    }
    public static void main(String[] args) {
        int userAge = 16;

        try {
            checkAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
        System.out.println("program ends.");
    }
}
