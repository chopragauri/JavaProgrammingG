package assignments.mod1_assignment;
public class Q24 {
    public static void main(String[] args) {
        int[] arr= {0,6,1,2,0,5};
        int sum = 0;
        System.out.println("og array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println("\nsum of all elements: " + sum);
    }
}
