package mod1;
public class Q4 {
    static class Operation {
        public void calc(int a, int b) {
            System.out.println("Base class: undefined operation");
        }
    }
    static class Addition extends Operation {
        @Override
        public void calc(int a, int b) {
            System.out.println("sum: " + (a + b));
        }
        public void calc(int a, int b, int c) {
            System.out.println("sum: " + (a + b + c));
        }

        public void calc(double a, double b) {
            System.out.println("sum: " + (a + b));
        }
    }
    public static void main(String[] args) {
        Operation op;
        op = new Addition();
        op.calc(10, 5);
        Addition add = new Addition();
        add.calc(1, 2, 3);
        add.calc(4.5, 5.5);
    }
}