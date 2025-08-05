package mod1_assignment;
public class Q36 {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;

        int result1 = a + b * c;
        int result2 = (a + b) * c;
        int result3 = a + b - c * 2;
        int result4 = a + b / c;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("\na + b * c      = " + result1);
        System.out.println("(a + b) * c     = " + result2);
        System.out.println("a + b - c * 2   = " + result3);
        System.out.println("a + b / c       = " + result4);
    }
}
