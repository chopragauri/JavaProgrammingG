package labExp.Aug18;
class GreetingThread extends Thread {
    private String message;
    public GreetingThread(String name,String message) {
        super(name);
        this.message = message;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + message);
            try {
                Thread.sleep(460);
            } catch (InterruptedException e) {
                System.out.println("thread interrupted.");
            } }
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

