package mod1_assignment;
public class Q37 {
    static class Student {
        String name;
        int rollNo;
        double cgpa;
        public Student() {
            name = "Unknown";
            rollNo = 0;
            cgpa = 0.0;
        }
        public Student(String name) {
            this.name = name;
            this.rollNo = 0;
            this.cgpa = 0.0;
        }
        public Student(String name, int rollNo, double cgpa) {
            this.name = name;
            this.rollNo = rollNo;
            this.cgpa = cgpa;
        }
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("CGPA: " + cgpa);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Gauri");
        Student s3 = new Student("Shivam", 28, 9.2);
        s1.display();
        s2.display();
        s3.display();
    }
}