package labExp.AUG25;

public class Q2BankAcc {
        int balanceAmt = 1000;
        public void withdraw(int amount) {
        if (balanceAmt>=amount){
            synchronized(this) {
                balanceAmt-=amount;
                try{
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", balance = " + balanceAmt);
                }catch(InterruptedException e){
                    Thread.interrupted();
                }
            }
        }else{
            System.out.println("Insufficient funds");
        }
}
    public static void main(String[] args) {
        Q2BankAcc account = new Q2BankAcc();

        Thread t1 = new Thread(() -> {
            account.withdraw(200);
        });
        Thread t2 = new Thread(() -> {
            account.withdraw(900);
        });
        t1.start();
        t2.start();

    }
}
