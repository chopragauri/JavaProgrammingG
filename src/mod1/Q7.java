package mod1;
final class Constants {
    // Final variable: cannot be changed
    public final double PI = 3.14159;

    // Final method: cannot be overridden
    public final void displayPI() {
        System.out.println("Value of PI: " + PI);
    }
}
public class Q7 {
        public static void main(String[] args) {
            Constants obj = new Constants();
            obj.displayPI();
            // obj.PI = 3.14;  //  Cannot assign a value to final variable 'PI'
        }
    }

