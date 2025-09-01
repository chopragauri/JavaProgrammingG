package mod3;

public class LockExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                account.withdraw(50);
            }
        };
        Thread t1  = new Thread(task);
        Thread t2  = new Thread(task);
        t1.start();
        t2.start();
    }
}
