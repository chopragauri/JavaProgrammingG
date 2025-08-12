package labExp.Aug11;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            sum += arr[i];
        }

        double average = (double) sum / arr.length;
        System.out.println("Largest element: " + largest);
        System.out.println("Average of elements: " + average);
        sc.close();
    }
}
