package labExp;

class NewThread extends Thread{
   @Override
    public void run(){
       for(int i=1 ; i<=10; i++){
           System.out.println(i);
           try{
               Thread.sleep(1000);
           }catch(InterruptedException e){
               System.out.println(e);;
           }
       }
   }
}
public class lab4 {
    public static void main(String[] args) {
        NewThread t1 = new NewThread();
        t1.start();
    }
}
