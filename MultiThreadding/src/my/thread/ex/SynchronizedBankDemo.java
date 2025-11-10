package my.thread.ex;

class SafeBankAccount {
    private int balance = 1000;

    // synchronized method
    public synchronized void withdraw(int amount) {
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
}

public class SynchronizedBankDemo {
    public static void main(String[] args) {
        SafeBankAccount account = new SafeBankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "Person-1");
        Thread t2 = new Thread(() -> account.withdraw(700), "Person-2");

        t1.start();
        t2.start();
    }
}
