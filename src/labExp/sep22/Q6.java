package labExp.sep22;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class Q6 {
    public static void main(String[] args) {
    
        Map<Integer,String> student = new HashMap<>();
        student.put(10,"Neymar Jr.");
        student.put(6,"Gauri Chopra");
        student.put(9,"Suhana");
        student.put(2,"Samridhi ");
        System.out.println("HashMap: Insertion order not conserved.");
        for (Map.Entry<Integer,String> entry : student.entrySet()) {
            System.out.println(entry.getKey() + " " +  entry.getValue());
        }

        Map<Integer,String> student2 = new LinkedHashMap<>();
        student2.put(10,"Neymar Jr.");
        student2.put(6,"Gauri Chopra");
        student2.put(9,"Suhana");
        student2.put(2,"Samridhi ");
        System.out.println("LinkedHashMap: Insertion order conserved.");
        for (Map.Entry<Integer,String> entry : student2.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}