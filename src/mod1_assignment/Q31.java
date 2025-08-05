package mod1_assignment;
import java.util.*;

public class Q31 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 2, 4, 3, 5, 1};
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : original) {
            set.add(num);
        }

        int[] unique = new int[set.size()];
        int i = 0;
        for (int val : set) {
            unique[i++] = val;
        }

        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Array after removing duplicates: " + Arrays.toString(unique));
    }
}
