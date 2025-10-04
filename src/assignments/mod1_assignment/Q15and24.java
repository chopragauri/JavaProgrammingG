package assignments.mod1_assignment;
public class Q15and24 {
    public static void main(String[] args) {
        int a=6;
        boolean Prime=true;
        System.out.println("integer number:" + a);
        if(a<=1){
            Prime=false;
        }else{
            int i=2;
            while(i<=a/2){
                if(a%i == 0){
                    Prime=false;
                    break;
                }
                i++;
            }
        }
        if(Prime){
            System.out.println(" is prime number.");
        }else{
            System.out.println("is not a prime number.");
        }
    }
}
