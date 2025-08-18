package labExp.Aug18;
class loop {
    static void loop(String name) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " iteration " + i);
        }
    }
}
public class q6 {
        public static void main(String[] args) {
            Thread t1 = new Thread(() -> loop.loop("Thread 1"));
            Thread t2 = new Thread(() -> loop.loop("Thread 2"));
            Thread t3 = new Thread(() -> loop.loop("Thread 3"));
            t1.setPriority(Thread.MIN_PRIORITY);
            t2.setPriority(Thread.NORM_PRIORITY);
            t3.setPriority(Thread.MAX_PRIORITY);
            t1.start();
            t2.start();
            t3.start();
        }
    }

