package assignments.mod4_assignment;

class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void displayType() {
        System.out.println("Type of T is: " + item.getClass().getName());
    }
}
public class GQ2 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(123);
        intBox.displayType();

        Box<String> strBox = new Box<>("Gauri Chopra");
        strBox.displayType();

        System.out.println("Integer Value: " + intBox.getItem());
        System.out.println("String Value: " + strBox.getItem());
    }
}
