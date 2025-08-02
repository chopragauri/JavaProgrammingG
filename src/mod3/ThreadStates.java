package mod3;
class MythreadStates extends Thread {
   @Override
   public void run() {
        for (int i = 0; i < 100; i++) {
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
//            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class ThreadStates {
    public static void main(String[] args) throws InterruptedException {

        MythreadStates t1 = new MythreadStates();
//        MythreadStates t2 = new MythreadStates();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        t1.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
//        t2.start();
//        System.out.println(t2.getName());
}
}
