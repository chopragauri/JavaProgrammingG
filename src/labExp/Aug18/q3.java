package labExp.Aug18;
class ChildThread extends Thread {
    @Override
    public void run() {
        try{
            Thread.sleep(3000);
            System.out.println("child thread ran");
        }catch(InterruptedException e){
            System.out.println("child thread interrupted");;
        }
    }
}
public class q3 {
    public static void main(String[] args) {
        ChildThread child= new ChildThread();
        child.start();
        try{
            child.join();
        }catch(InterruptedException e){
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread ran");
    }

}
