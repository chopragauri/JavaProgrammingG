package mod1;
//import java.util.Scanner;
class Largest{
    int max;
    public void getMax(int a , int b , int c){
        if(a>b && a>c){
            max=a;
            System.out.println("The largest value is: "+ max);
        }else if(b>a && b>c){
            max=b;
            System.out.println("The largest value is: "+ max);
        }else if(c>a && b>a){
            max=c;
            System.out.println("The largest value is: "+ max);
        }else {
            System.out.println("all values are equal.");
        }
    }
}
public class Q20 {
public static void main(String[] args) {
    Largest max = new Largest();
    max.getMax(6,7,9);
    }
}
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//
//        System.out.println("enter value for a: ");
//        int a=input.nextInt();
//        System.out.println("enter value for b: ");
//        int b=input.nextInt();
//        System.out.println("enter value for c: ");
//        int c=input.nextInt();
//        int max;
//        if(a>b && a>c){
//            max=a;
//            System.out.println("The largest value is: "+ max);
//        }else if(b>a && b>c){
//            max=b;
//            System.out.println("The largest value is: "+ max);
//        }else if(c>a && b>a){
//            max=c;
//            System.out.println("The largest value is: "+ max);
//        }else{
//            System.out.println("all values are equal.");
//        }
//    }