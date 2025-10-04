package assignments.mod3_assignment;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        System.out.println(Pattern.matches("[a-z0-9]+@+gmail.com*", email));
        if (Pattern.matches("[a-z0-9]+@+gmail.com*", email)) {
            System.out.println("Valid email address");
        }else  {
            System.out.println("Invalid email address");
        }
        }
    }

