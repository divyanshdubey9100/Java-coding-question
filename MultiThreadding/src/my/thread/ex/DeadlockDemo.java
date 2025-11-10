package my.thread.ex;

class Resource {
    synchronized void methodA(Resource r2) {
        System.out.println(Thread.currentThread().getName() + " is executing methodA");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        
    }

    synchronized void methodB(Resource r1) {
        System.out.println(Thread.currentThread().getName() + " is executing methodB");
    }
}

public class DeadlockDemo {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.methodA(r2), "Thread-1");
        Thread t2 = new Thread(() -> r2.methodA(r1), "Thread-2");

        t1.start();
        t2.start();
    }
}

