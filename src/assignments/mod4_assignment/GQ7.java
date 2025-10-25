package assignments.mod4_assignment;
class Boxx<T>{
    T item;
    void add(T item){
        this.item = item;
    }
    void getItem(){
        System.out.println("item:"+item);
    }
}

public class GQ7 {
    public static void main(String[] args) {
        Boxx<Integer> integer = new Boxx<>();
        integer.add(1);
        Boxx<String> string = new Boxx<>();
        string.add("hello");
        string.getItem();
        integer.getItem();
    }
}
