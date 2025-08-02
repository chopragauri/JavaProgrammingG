package mod1;
public class Q2 {
    static class Operation {
        public void calc(int a, int b) {
            System.out.println("base operation undefined!!");
        }
    }
    static class Addition extends Operation {
        @Override
        public void calc(int a, int b) {
            System.out.println("sum: " + (a + b));
        }
    }
    static class Subtraction extends Operation {
        @Override
        public void calc(int a, int b) {
            System.out.println("difference: " + (a - b));
        }
    }
    public static void main(String[] args) {
        Operation op;
        op = new Addition();
        op.calc(6, 12);
        op = new Subtraction();
        op.calc(12, 6);
    }
}