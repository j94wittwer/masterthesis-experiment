package RaceConditionsTask;


/**
 * This Class represents a BankAccount. Customers can deposit and withdraw money from it. One conditions is, it should not
 * go under 0 --> Customers should not be able to withdraw more money than they currently hold.
 */
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            // make BankBackend API call
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(int amount) {
        this.balance += amount;
        // make BankBackend API call
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
