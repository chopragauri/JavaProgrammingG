package lambda;
public class mainLambda {
    public static void main(String[] args) {
        Calculator add = (a,b)->(a+b);
        System.out.println("sum: " + (add.compute(2,6)));
        Calculator sub = (a,b)->(a-b);
        System.out.println("difference: " + (sub.compute(2,6)));
        Calculator product=(a,b)->(a*b);
        System.out.println("product: " + (product.compute(6,12)));
        Calculator divide=(a,b)->{
            if(b!=0){
                return a/b;
            }else{
                System.out.println("cannot divide by zero");
                return 0;
            }
        };
        System.out.println("quotient: " + (divide.compute(12,12)));
    }
}
