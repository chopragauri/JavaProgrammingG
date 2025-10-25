package Java_Lab_Assignment;

class Student {
    int id;
    String name;
    String course;

    Student() {
        System.out.println("Default Student constructor called");
    }


    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }


    void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class GraduateStudent extends Student {
    String specialization;

    GraduateStudent(int id, String name, String course, String specialization) {
        super(id, name, course);
        this.specialization = specialization;
    }


    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

public class Q1 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Gauri", "B.Tech");
        s1.displayDetails();

        System.out.println("\nGraduate Student Info:");
        GraduateStudent g1 = new GraduateStudent(201, "Abhishek", "M.Tech", "Artificial Intelligence");
        g1.displayDetails();
    }
}
