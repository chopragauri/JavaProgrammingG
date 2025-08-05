package mod1_assignment;
interface Printable {
    void print();
}
interface Drawable {
    void draw();
}

public class Q6 implements Printable, Drawable {

    @Override
    public void print() {
        System.out.println("Printing details of the circle...");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius 5 units.");
    }

    public static void main(String[] args) {
        Q6 circle = new Q6();
        circle.print();
        circle.draw();
    }
}

