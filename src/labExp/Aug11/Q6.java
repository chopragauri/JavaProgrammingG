package labExp.Aug11;
@FunctionalInterface
interface StringOperation {
    String operate(String str);
}

public class Q6 {
    public static void main(String[] args) {
        String s1 = "gauri chopra";

        StringOperation upper = str -> str.toUpperCase();
        System.out.println(upper.operate(s1));

        StringOperation reverse = str -> new StringBuilder(str).reverse().toString();
        System.out.println(reverse.operate(s1));
    }
}