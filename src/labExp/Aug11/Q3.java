package labExp.Aug11;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("name: " + name+ "\nage: " + age);
    }
}
class Employee extends Person {
    int EmployeeID;

    Employee(String name, int age, int employeeID) {
        super(name, age);
        this.EmployeeID = employeeID;
    }
    @Override
    void display() {
        super.display();
        System.out.println("EmployeeID: " + EmployeeID);
    }
}
class Manager extends Employee{
    String department;

    Manager(String name, int age , int EmployeeID,  String department) {
        super(name, age, EmployeeID);
        this.department = department;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
public class Q3 {
    public static void main(String[] args) {
    Manager manager= new Manager("Gauri",19,38,"AI");
    manager.display();
}
}
