package assignments.mod3_assignment;

public class Q1 extends Thread {

        @Override
        public void run() {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even number: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted.");
                }
            }
        }

        public static void main(String[] args) {
            Q1 thread = new Q1();
            thread.start();
        }
    }
