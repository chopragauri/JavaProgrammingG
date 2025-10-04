package assignments.mod1_assignment;

public class Q40 {
        public static void greetStatic() {
            System.out.println("Hello from static method!");
        }
        public void greetNonStatic() {
            System.out.println("Hello from non-static method!");
        }
        public static void main(String[] args) {
            Q40.greetStatic();
            Q40 obj = new Q40();
            obj.greetNonStatic();
        }
    }

