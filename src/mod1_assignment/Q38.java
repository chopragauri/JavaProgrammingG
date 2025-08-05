package mod1_assignment;
class Student1 {
    String name;
    int rollNo;
    public Student1(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    public Student1(Student1 other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Q38 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Gauri", 28);
        Student1 s2 = new Student1(s1);

        System.out.println("Original Student:");
        s1.display();

        System.out.println("\nCopied Student:");
        s2.display();
    }
}