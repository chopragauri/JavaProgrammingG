package labExp.AUG25;
class Thread1 extends Thread {
    boolean running = true ;
    @Override
    public void run() {
        int i = 1;
        while (running && i <= 100) {
            System.out.println(i++);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void stopRunning(){
        running = false ;
    }
}
    public class Q5 {
        public static void main(String[] args) {
    Thread1 t1 = new Thread1() ;
    t1.start();
        }
}
