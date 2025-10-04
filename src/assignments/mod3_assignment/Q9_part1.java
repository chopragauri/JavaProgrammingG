package assignments.mod3_assignment;
class consumer extends Thread {
    SharedResource resource;
    consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.consume();
            System.out.println("Consumer has consumed");
        }
    }
}
class producer extends Thread {
    SharedResource resource;

    producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce(i);
            System.out.println("Producer has produced");
        }
    }
}
public class Q9_part1 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producerThread = new Thread(new producer(resource));
        Thread consumerThread = new Thread(new consumer(resource));
        producerThread.start();
        consumerThread.start();

    }
}
class SharedResource {
    boolean hasData = false;
    int data = 0;

    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasData = false;
        notify();
        return data;
    }

    public synchronized void produce(int val) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasData = true;
        data = val;
        notify();
    }
}