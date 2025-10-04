package assignments.mod1_assignment;
public class Q30 {
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int key = 10;
        int result = binarySearch(sortedArray, key);

        if (result == -1) {
            System.out.println("Element " + key + " not found.");
        } else {
            System.out.println("Element " + key + " found at index: " + result);
        }
    }
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}