import java.util.ArrayList;

public class GenericsEx {
    //for type safe we use generics, code reusability , compile time efficiency
    public static void main(String[] args) {
//    int[] abc = new int [5];
//    ArrayList<String> data = new ArrayList();
//    data.add("Abhishek");
//    data.add("Karl");
//    String val1 = (String) data.get(0);
//    String val2 = (String) data.get(1);
//        System.out.println(val1);
//        System.out.println(val2);
    Container<String> container1 = new Container<>();
    container1.setId("100");
        System.out.println(container1.getId());
    }

}
