package mod3_assignment;
import java.util.concurrent.locks.ReentrantLock;

public class Q11 {

    private static int counter = 0;
    private static final ReentrantLock lock = new ReentrantLock(true);
    public static void increment() {
        lock.lock();
        try {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented to: " + counter);
        } finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                increment();
            }
        };
        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");
        Thread t3 = new Thread(task, "Thread-C");
        t1.start();
        t2.start();
        t3.start();
        t1.join(); t2.join(); t3.join();
        System.out.println("Final Counter Value (Safe): " + counter);
    }
}

//public class Q11{
//
//    private static int counter = 0;
//
//    public static void increment() {
//        counter++;
//        System.out.println(Thread.currentThread().getName() + " incremented to: " + counter);
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        Runnable task = () -> {
//            for (int i = 0; i < 5; i++) {
//                increment();
//            }
//        };
//
//        Thread t1 = new Thread(task, "Thread-X");
//        Thread t2 = new Thread(task, "Thread-Y");
//        Thread t3 = new Thread(task, "Thread-Z");
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//        t1.join(); t2.join(); t3.join();
//
//        System.out.println("Final Counter Value (Unsafe): " + counter);
//    }
//}
