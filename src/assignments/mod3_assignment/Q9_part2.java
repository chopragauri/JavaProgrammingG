package assignments.mod3_assignment;
class NumberPrinter {
    private int number = 1;
    private final int MAX = 20;
    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(number);
                number++;
                notify();
            }
        }
    }
    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(number);
                number++;
                notify();
            }
        }
    }
}
public class Q9_part2 extends Thread {
        public static void main(String[] args) {
            NumberPrinter printer = new NumberPrinter();
            Thread oddThread = new Thread(() -> printer.printOdd());
            Thread evenThread = new Thread(() -> printer.printEven());
            oddThread.start();
            evenThread.start();
        }
}

