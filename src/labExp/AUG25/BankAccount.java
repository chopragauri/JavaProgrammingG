package labExp.AUG25;
public class BankAccount {
 int balanceAmt = 1000;
 public synchronized void withdraw(int amount) {
     if(balanceAmt >= amount){
         balanceAmt -= amount;
         try{
             Thread.sleep(1000);
             System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", balance = " + balanceAmt);
         }catch(InterruptedException e){
         }
     }else{
         System.out.println("Insufficient funds");
     }
 }
 public static void main(String[] args) {
        BankAccount account = new BankAccount();
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
