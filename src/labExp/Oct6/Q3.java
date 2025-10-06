package labExp.Oct6;
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person{
    int employeeId;
    double baseSalary;
    Employee(String name, int age, int employeeId, double baseSalary) {
        super(name,age);
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }
}
class Manager extends Employee{
    double salary;
    Manager(String name, int age, int employeeId, double baseSalary) {
        super(name,age,employeeId,baseSalary);
    }
    double calculateBonus(double baseSalary){
        return salary=baseSalary*0.5+baseSalary;
    }
}
final class HRReport{
    static void print(Manager m){
        System.out.println("Employee Name: " + m.name);
        System.out.println("Employee Age: " + m.age);
        System.out.println("Employee employeeId: " + m.employeeId);
        System.out.println("Employee Base Salary: " + m.baseSalary);
        System.out.println("Employee Salary with bonus: " + m.calculateBonus(m.baseSalary));
    }
}
public class Q3 {
    public static void main(String[] args) {
        Manager m = new Manager("ABC",20,38,200000.0);
        HRReport hr = new HRReport();
        hr.print(m);
    }
}
