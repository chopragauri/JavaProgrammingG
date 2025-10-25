package Java_Lab_Assignment;
abstract class Employee {
    protected int empId;
    protected String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + empId + ", Name: " + name);
    }
}

class PermanentEmployee extends Employee {
    private double basicSalary;
    private double benefits;

    public PermanentEmployee(int empId, String name, double basicSalary, double benefits) {
        super(empId, name);
        this.basicSalary = basicSalary;
        this.benefits = benefits;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + benefits;
    }
}

class ContractualEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public ContractualEmployee(int empId, String name, int hoursWorked, double hourlyRate) {
        super(empId, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Q2{
    public static void main(String[] args) {

        Employee emp1 = new PermanentEmployee(101, "Suhana", 30000, 5000);
        Employee emp2 = new ContractualEmployee(102, "Gauri", 100, 300);


        emp1.displayDetails();
        System.out.println("Salary: ₹" + emp1.calculateSalary());

        System.out.println();

        emp2.displayDetails();
        System.out.println("Salary: ₹" + emp2.calculateSalary());
    }
}

