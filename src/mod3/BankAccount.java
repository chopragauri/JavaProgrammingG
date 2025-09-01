package mod3;
import java.util.concurrent.locks.Lock;
public class BankAccount {
    int balanceAmount =1000;
    public void withdraw(int amount) {
        if(balanceAmount >100){
           balanceAmount -=amount;
           try{
               Thread.sleep(1000);
           }catch(InterruptedException e){

           }
        }else{
            System.out.println("Insufficient funds");
        }
    }
}
//package mod3;
//
//public class BankAccountSyncMethod {
//    private int balanceAmount = 1000;
//
//    // synchronized METHOD
//    public synchronized void withdraw(int amount) {
//        if (balanceAmount >= amount) {
//            balanceAmount -= amount;
//            try { Thread.sleep(200); } catch (InterruptedException ignored) {}
//            System.out.println(Thread.currentThread().getName() +
//                    " withdrew " + amount + ", balance = " + balanceAmount);
//        } else {
//            System.out.println("Insufficient funds for " + Thread.currentThread().getName());
//        }
//    }
//
//    public static void main(String[] args) {
//        BankAccountSyncMethod account = new BankAccountSyncMethod();
//        Runnable task = () -> account.withdraw(50);
//
//        Thread t1 = new Thread(task, "T1");
//        Thread t2 = new Thread(task, "T2");
//        Thread t3 = new Thread(task, "T3");
//
//        t1.start(); t2.start(); t3.start();
//    }
//}