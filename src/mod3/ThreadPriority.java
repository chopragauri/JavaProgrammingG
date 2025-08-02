package mod3;

class PriorityThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException {
        PriorityThread pt = new PriorityThread();

        Thread low = new Thread(pt, "Thread1");
        Thread medium = new Thread(pt, "Thread2");
        Thread high = new Thread(pt, "Thread3");

        low.setPriority(Thread.MIN_PRIORITY);
        medium.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        medium.start();
        high.start();
    }
}
//package mod3;
//class PriorityThread implements Runnable {
//     @Override
//     public void run() {
//         try {
//             Thread.sleep(500);
//         } catch(InterruptedException e){
//             e.printStackTrace();
//
//         for (int i = 0; i < 10; i++) {
//             System.out.println(Thread.currentThread().getName());
//         }
//     }
// }
//public class ThreadPriority {
//    public static void main(String[] args) throws InterruptedException {
//        PriorityThread pt = new PriorityThread();
//        Thread low = new Thread(pt, "Thread1");
//        Thread medium = new Thread(pt, "Thread2");
//        Thread high = new Thread(pt, "Thread3");
//        low.setPriority(Thread.MIN_PRIORITY);
//        medium.setPriority(Thread.NORM_PRIORITY);
//        high.setPriority(Thread.MAX_PRIORITY);
//        low.start();
//        low.sleep(500);
//        medium.start();
//        high.start();
//
//
//    }
//}}

