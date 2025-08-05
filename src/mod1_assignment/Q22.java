package mod1_assignment;
public class Q22 {
        static boolean palindrome(String str) {
            int start = 0;
            int end = str.length() - 1;
            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
        public static void main(String[] args) {
            String word = "kayak";
            if (palindrome(word)) {
                System.out.println(word +" is a palindrome.");
            } else {
                System.out.println(word+ " is not a palindrome.");
            }
            int num = 1231;
            String numStr = Integer.toString(num);
            if (palindrome(numStr)) {
                System.out.println(numStr+ " is a palindrome.");
            } else {
                System.out.println(numStr+ " is not a palindrome.");
            }
        }
}

