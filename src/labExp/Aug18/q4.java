package labExp.Aug18;
import java.util.concurrent.ThreadLocalRandom;
class GreetingThread extends Thread {
    private String message;
    public GreetingThread(String name,String message) {
        super(name);
        this.message = message;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + message + " (count " + i + ")");
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(100, 501));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(getName() + " interrupted.");
                break;
            }
        }
        System.out.println(getName() + " finished.");
    }
}
public class q4 {
        public static void main(String[] args) {
            Thread tA = new GreetingThread("threadA", "Hello from Thread A!");
            Thread tB = new GreetingThread("threadB", "Greetings from Thread B!");
            Thread tC = new GreetingThread("threadC", "Hi from Thread C!");
            tA.start();
            tB.start();
            tC.start();
        }
    }

