import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Comparator;



public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
////        list1.add(30);
//        list1.add(40);
//        list1.set(1,60);
//        list1.add(2,30);
////        Collection.sort(list1);
//        for (int i=0; i<list1.size();i++) {
//            System.out.println(list1.get(i));
//        }
//        list1.sort(new IntComparator());
//
//        for (int i=0; i<list1.size();i++) {
//            System.out.println("after sorting"+ list1.get(i));
//        }
//        System.out.println(list1.contains(40));
//        list1.addAll(list1);
//        for (int i=0; i<list1.size();i++) {
//            System.out.println(list1.get(i));
//        }
//        ArrayList<Integer> list2 = new ArrayList<>(1000);
//        System.out.println("initially size: "+ list2.size());
//        list2.add(1);
//        System.out.println("size after adding: "+ list2.size());
//        Integer[] abc= new Integer[10];
//        abc[0]=10;
//        abc[1]=20;
//        List<Integer> list3 = Arrays.asList(abc);
////        list3.add(3);
//
//        System.out.println(list3.get(0));
        Student student1 = new Student();
        student1.setId(12);
        student1.setName("Gauri");
        student1.setMarks(30);
        Student student2 = new Student();
        student1.setId(12);
        student1.setName("Suhana");
        student1.setMarks(5);
        List<Student> list4 = new ArrayList<>();
        list4.add(student1);
        list4.add(student2);
        System.out.println(list4);
    }
}
//class IntComparator implements Comparator<Integer> {
//    @Override
//    public int compare(Integer int1, Integer int2) {
//        return int2-int1;
//    }}
//Default capacity 10 , different fron size