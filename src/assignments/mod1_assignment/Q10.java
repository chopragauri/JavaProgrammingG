package assignments.mod1_assignment;

final class FinalClass {
    final int x = 10;
    final void display() {
        System.out.println("Inside FinalClass:");
        System.out.println("Final variable x = " + x);
    }
}
// class SubClass extends FinalClass {}  // Not allowed
public class Q10 {
        public static void main(String[] args) {
            FinalClass obj = new FinalClass();
            obj.display();
            // obj.x = 20;  // Cannot assign a value to final variable 'x'
        }
    }

