package in.problems.code.corejava;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerProblem {

    static class CustomBlockingQueue<T> {
        private final Queue<T> queue;
        private final int capacity;

        public CustomBlockingQueue(int capacity) {
            this.queue = new LinkedList<>();
            this.capacity = capacity;
        }

        // Producer calls this
        public synchronized void put(T item) throws InterruptedException {
            while (queue.size() == capacity) {
                System.out.println("Queue is full. Producer is waiting...");
                wait();
            }
            queue.add(item);
            System.out.println("Produced: " + item);
            notifyAll();
        }

        // Consumer calls this
        public synchronized T take() throws InterruptedException {
            while (queue.isEmpty()) {
                System.out.println("Queue is empty. Consumer is waiting...");
                wait();
            }
            T item = queue.remove();
            System.out.println("Consumed: " + item);
            notifyAll();
            return item;
        }
    }

    // Main class
    public static void main(String[] args) {

        CustomBlockingQueue<Integer> queue = new CustomBlockingQueue<>(5);

        // Producer Thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    queue.put(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    queue.take();
                    Thread.sleep(800);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
