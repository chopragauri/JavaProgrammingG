package mod1_assignment;
class num{
    void num(int a){
        System.out.println("num: "+a);
    }
}
class Square extends num{
    void square(int a){
        System.out.println("square: "+a*a);
    }
}
class Cube extends Square{
    void cube(int a){
        System.out.println("cube: "+ a*a*a);
    }
}
public class Q42 {
    public static void main(String[] args) {
    Cube a =new Cube();
    a.num(5);
    a.square(5);
    a.cube(5);
    }
}
