package RaceConditionsTask;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<BankAccount> accounts;
    private double value;

    public Bank(String name, ArrayList<BankAccount> accounts) {
        this.name = name;
        this.accounts = accounts;
        this.value = 0;
        this.updateValue();
    }

    public void updateValue() {
        for (BankAccount account :
                this.accounts) {
            this.value += account.getBalance();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.updateValue();
        this.accounts = accounts;
    }
}
