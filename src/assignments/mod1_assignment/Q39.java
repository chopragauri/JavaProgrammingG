package assignments.mod1_assignment;
class Student {
    String name;
    int rollNo;
    double cgpa;

    public Student(String name, int rollNo, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("CGPA: " + cgpa);
    }
}

public class Q39 {

        public static void main(String[] args) {
            Student s1 = new Student("Gauri Chopra", 28, 8.67);
            s1.display();
        }
    }

