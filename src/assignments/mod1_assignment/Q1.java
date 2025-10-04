package assignments.mod1_assignment;
class BankAccount {
    private String name;
    private double balance;
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
}
public class Q1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Gauri Chopra", 6000.0);
        account.deposit(500.0);
        String name = account.getName();
        System.out.println("account holder: " + name);
        System.out.println("current balance: " + account.getBalance());
    }
}

