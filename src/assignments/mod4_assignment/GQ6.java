package assignments.mod4_assignment;
class Pair<K, V>{
    private K key;
    private V value;
    void setKandV(K key, V value){
        this.key = key;
        this.value = value;
    }
    void getKandV(){
        System.out.println("Key "+ key);
        System.out.println("Value "+ value);
    }
}

public class GQ6 {
    public static void main(String[] args) {
        Pair<Integer,String> pair = new Pair<>();
        pair.setKandV(1,"one");
        pair.getKandV();
    }
}
