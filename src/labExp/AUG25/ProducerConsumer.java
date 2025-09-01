//package labExp.AUG25;
//class consumer extends Thread{
//    sharedResource  resource;
//
//}
//class producer extends Thread{
//sharedResource resource;
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            resource.produce(i);
//            try {
//                sleep(500);
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }
//}
//class sharedResource{
//    boolean hasData = false;
//    int data =0 ;
//
//    public synchronized void produce(int val) {
//        while (hasData) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                Thread.currentThread();
//            }
//        }
//        data = val;
//        hasData = true;
//        notify();
//    }
//
//    public synchronized int consume() {
//        while (!hasData) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }
//        hasData = false;
//        notify();
//        return data;
//    }
//}}
//public class ProducerConsumer {
//    public static void main(String[] args) {
//
//    }
//}
