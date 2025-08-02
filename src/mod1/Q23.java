package mod1;
public class Q23 {
        public static void main(String[] args) {
            int n = 5;
            int first = 0, second = 1;
            System.out.println("fibonacci series up to " + n + " terms:");
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }
}

