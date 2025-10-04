package assignments.mod1_assignment;
public class Q34 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        String result = (a % 2 == 0) ? "Even" : "Odd";

        System.out.println("Between " + a + " and " + b + ", the larger is: " + max);
        System.out.println(a + " is " + result);
    }
}