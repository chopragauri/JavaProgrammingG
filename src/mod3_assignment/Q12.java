package mod3_assignment;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;
class SharedResource1 {
    private final ReentrantLock lock1 = new ReentrantLock();
    private final ReentrantLock lock2 = new ReentrantLock();

    public void taskA() {
        try {
            if (lock1.tryLock(1000, TimeUnit.MILLISECONDS)) {
                System.out.println(Thread.currentThread().getName() + " acquired lock1");
                Thread.sleep(100); // Simulate some work

                if (lock2.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " acquired lock2");
                        System.out.println(Thread.currentThread().getName() + " is performing Task A");
                    } finally {
                        lock2.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " could not acquire lock2, releasing lock1");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock1.isHeldByCurrentThread()) {
                lock1.unlock();
            }
        }
    }

    public void taskB() {
        try {
            if (lock2.tryLock(1000, TimeUnit.MILLISECONDS)) {
                System.out.println(Thread.currentThread().getName() + " acquired lock2");
                Thread.sleep(100); // Simulate some work

                if (lock1.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " acquired lock1");
                        System.out.println(Thread.currentThread().getName() + " is performing Task B");
                    } finally {
                        lock1.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " could not acquire lock1, releasing lock2");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock2.isHeldByCurrentThread()) {
                lock2.unlock();
            }
        }
    }
}

public class Q12 {
    public static void main(String[] args) {
        SharedResource1 resource = new SharedResource1();

        Thread thread1 = new Thread(resource::taskA, "Thread-A");
        Thread thread2 = new Thread(resource::taskB, "Thread-B");

        thread1.start();
        thread2.start();
    }
}
