package mod1_assignment;
class Operation2 {
    public void calc(int a, int b) {
        System.out.println("base operation undefined!!");
    }
}
class Addition extends Operation2 {
    @Override
    public void calc(int a, int b) {
        System.out.println("sum: " + (a + b));
    }
}
class Subtraction extends Operation2 {
    @Override
    public void calc(int a, int b) {
        System.out.println("difference: " + (a - b));
    }
}
public class Q2 {
    public static void main(String[] args) {
        Operation2 op;
        op = new Addition();
        op.calc(6, 12);
        op = new Subtraction();
        op.calc(12, 6);
    }
}