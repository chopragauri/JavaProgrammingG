package mod1_assignment;
public class Q47 {
    public static void main(String[] args) {
        String s1 = "gauri";
        char[] chars= s1.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        String reversed = new String(chars);
        System.out.println("og "+ s1);
        System.out.println("reversed "+reversed);
    }
}
