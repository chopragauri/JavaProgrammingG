package mod3_assignment;

public class Q4 {
        public static void main(String[] args) throws InterruptedException {
            Thread t1 = new Thread(() -> {
                try {
                    for (int i = 10; i > 0; i--) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            Thread t2 = new Thread(() -> {
                try {
                    Thread.sleep(100);
                    for (int i = 18; i > 0; i--) {
                        System.out.println("Tick..");
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            t2.start();
            t1.start();

        }
    }
