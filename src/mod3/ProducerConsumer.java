//package mod3;
//class consumer extends Thread{
//    SharedResource resource;
//
//    consumer(SharedResource resource) {
//        this.resource = resource;
//    }
//}
//class producer extends  Thread{
//    SharedResource resource;
//    producer(SharedResource resource) {
//        this.resource = resource;
//    }
//}
//
//class SharedResource{
//    boolean hasData = false;
//    int data = 0;
//    public synchronized int consume(){
//
//    }
//    public synchronized void produce(int val){
//        while (hasData){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//            e.printStackTrace();}
//        }
//        }
//    }
//
//
//        public class ProducerConsumer {
//
//}
