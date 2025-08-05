package mod1_assignment;

public class Q18 {
    public static void main(String[] args) {
        int[] arr= {0,6,1,2,0,5};
        int max= arr[0];
        int min= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("largest value: "+ max);
        System.out.println("smallest value: "+ min);
    }
}
