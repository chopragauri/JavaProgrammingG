package labExp;

abstract class NewThread1 implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Hello World");
        }
    }
}
public class lab5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NewThread1() {});
        t1.start();
    }
}
