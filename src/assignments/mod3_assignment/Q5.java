package assignments.mod3_assignment;

public class Q5 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(currentThread().getName() + " is running: count " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Q5 t1 = new Q5();
        t1.setName("Worker-1");
        Q5 t2 = new Q5();
        t2.setName("Worker-2");
        Q5 t3 = new Q5();
        t3.setName("Worker-3");
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}
