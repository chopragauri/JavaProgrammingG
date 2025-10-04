package assignments.mod3_assignment;
class Chopstick {
}
class Philosopher extends Thread {
    private final String name;
    private final Chopstick leftChopstick;
    private final Chopstick rightChopstick;

    public Philosopher(String name, Chopstick left, Chopstick right) {
        this.name = name;
        this.leftChopstick = left;
        this.rightChopstick = right;
    }

    @Override
    public void run() {
        synchronized (leftChopstick) {
            System.out.println(name + " picked up left chopstick.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (rightChopstick) {
                System.out.println(name + " picked up right chopstick and is eating.");
                try {
                    Thread.sleep(1000); // Simulate eating
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(name + " put down right chopstick.");
        }
        System.out.println(name + " put down left chopstick.");
    }
}
public class QUES8 {
    public static void main(String[] args) {
        Chopstick chopstick1 = new Chopstick();
        Chopstick chopstick2 = new Chopstick();
        Philosopher p1 = new Philosopher("Philosopher 1", chopstick1, chopstick2);
        Philosopher p2 = new Philosopher("Philosopher 2", chopstick2, chopstick1);
        p1.start();
        p2.start();
    }
}
