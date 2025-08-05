package mod1_assignment;

public class Q50 {
    boolean  isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "naman";
        System.out.println("og str: " + s1);
        Q50 p = new Q50();
        if(p.isPalindrome(s1)){
            System.out.println( s1+ " is a palindrome.");
        }
    }
}
