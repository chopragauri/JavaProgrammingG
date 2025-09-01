package labExp.SEPT1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Q5 {
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

