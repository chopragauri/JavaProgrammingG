package assignments.mod4_assignment;
class NumericBox<T extends Number> {
    private T num;

    public NumericBox(T num) {
        this.num = num;
    }

    public void displayType() {
        System.out.println("Stored type: " + num.getClass().getName());
    }

    public double getDoubleValue() {
        return num.doubleValue();
    }
}
public class GQ3 {
        public static void main(String[] args) {
            NumericBox<Integer> intBox = new NumericBox<>(42);
            NumericBox<Double> doubleBox = new NumericBox<>(3.14159);
            intBox.displayType();
            doubleBox.displayType();
            System.out.println("Integer as double: " + intBox.getDoubleValue());
            System.out.println("Double as double: " + doubleBox.getDoubleValue());
        }
    }

