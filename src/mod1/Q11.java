package mod1;

public class Q11 {
    public static void main(String[] args) {
        String a = "Gauri ";
        String b= "naman";
        StringBuilder a1 =new StringBuilder(a);
        StringBuilder a2 =new StringBuilder(b);
        System.out.println(a + " after appending: "+ a1.append(" Chopra"));
        System.out.println("reverse of " + b + " is: " + a2.reverse());
        a1.insert(6,"Pretty");
        System.out.println(a1);
        System.out.println(a2.replace(1,5,"eymar"));
        System.out.println(a2.delete(1,7));
    }
}
