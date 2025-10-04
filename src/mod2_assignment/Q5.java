package mod2_assignment;
import java.util.ArrayList;
import java.util.List;
public class Q5 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Gauri");
        names.add("suhana");
        names.add("lavya");
        names.add("Samridhi");

        names.sort((s1, s2) -> s2.compareToIgnoreCase(s1));
        System.out.println("Strings in descending order:" + names);
    }
}
