package assignments.mod2_assignment;

import assignments.mod2_assignment.utilities.mathUtils;

public class TestMathUtils {
    public static void main(String[] args) {
        mathUtils mu = new mathUtils();
        int sum = mu.add(10, 28);
        System.out.println("sum: " + sum);
    }
}
