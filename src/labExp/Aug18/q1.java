package labExp.Aug18;
public class q1 {
        public static void main(String[] args) {
            Thread t1 = new Thread(() -> {
                System.out.println("running " + Thread.currentThread().getName());
            });
            t1.setName("Thread 1");
            Thread t2 = new Thread(() -> {
                System.out.println("running " + Thread.currentThread().getName());
            });
            t2.setName("Thread 2");
            t1.start();
            t2.start();
        }
    }

