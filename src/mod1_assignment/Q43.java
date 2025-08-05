package mod1_assignment;
class NumberPrinter {
    void display(int num) {
        System.out.println("Number from parent: " + num);
    }
}
class SquarePrinter extends NumberPrinter {
    @Override
    void display(int num) {
        super.display(num);
        System.out.println("Square from child: " + (num * num));
    }
}
public class Q43 {
        public static void main(String[] args) {
            SquarePrinter printer = new SquarePrinter();
            printer.display(7);
        }
    }

