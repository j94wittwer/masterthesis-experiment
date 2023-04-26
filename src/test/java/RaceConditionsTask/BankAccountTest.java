package RaceConditionsTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void testBankAccountWithdrawal() throws InterruptedException {
        BankAccount account = new BankAccount(1000);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.deposit(10);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.withdraw(10);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(account.getBalance());
    }

}
