package assignments.mod4_assignment;
import java.util.Arrays;

class Elements{
    <T> void swapElements(T[] arr, int index1, int index2){
        T temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println("After swapping: "+ Arrays.toString(arr));
    }
}
public class Ques8 {
    public static void main(String[] args) {
    Elements integer = new Elements();
    Integer[] intArr= {2,3,4};
    System.out.println("Before swapping: "+ Arrays.toString(intArr));
    integer.swapElements(intArr,0,2);

    Elements string = new Elements();
    String[] strArr= {"a","b","c"};
    System.out.println("Before swapping: "+ Arrays.toString(strArr));
    string.swapElements(strArr,0,2);

    }
}
