package my.thread.ex;

class BankAccount {
    private int balance = 1000;

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " proceeding to withdraw...");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining: " + balance);
        } else {
            System.out.println("Not enough balance for " + Thread.currentThread().getName());
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "Person-1");
        Thread t2 = new Thread(() -> account.withdraw(700), "Person-2");

        t1.start();
        t2.start();
    }
}
