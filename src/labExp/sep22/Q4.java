package labExp.sep22;
import java.util.Map;
import java.util.HashMap;
public class Q4 {
    public static void main(String[] args) {
        HashMap<Integer, String> employee = new HashMap<>();
        employee.put(138, "Gauri Chopra");
        employee.put(154,"Suhana");
        employee.put(106,"Samridhi");
        employee.put(105,"Neymar Jr.");
        System.out.println(employee);

        if(employee.containsKey(105)){
            System.out.println("key exists");
        }else{
            System.out.println("key does not exist");
        }

        for (Integer id : employee.keySet()) {
            System.out.println(id + " " + employee.get(id));
        }
    }
}
