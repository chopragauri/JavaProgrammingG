package labExp.sep15;
import java.util.Arrays;
public class Q2 {
    public static <T> void swapElements(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        Integer[] arr = {0,6,1,2,5};
        swapElements(arr, 2,3);
        System.out.println(Arrays.toString(arr));
    }
}
