package labExp.Aug18;
class Num implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
public class q2 {
        public static void main(String[] args) {
            Thread t1 = new Thread(new Num());
            t1.start();
        }
    }

