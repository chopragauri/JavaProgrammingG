package assignments.mod1_assignment;

abstract class Operation{
    void calculate(int a, int b){
        System.out.println("operation undefined.");
    }
}
class Multiplication extends Operation{
    @Override
    void calculate(int a , int b){
        System.out.println("product: "+ (a*b));
    }
}
public class Q44 {
    public static void main(String[] args) {
        Operation mul = new Multiplication();
        mul.calculate(6,2);
    }
}
