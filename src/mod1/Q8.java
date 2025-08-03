package mod1;
class Details{
    String name;
    int enroll_no;
    double cgpa;
    public Details(String name, int enroll_no, double cgpa){
        this.name= name;
        this.enroll_no= enroll_no;
        this.cgpa= cgpa;
    }
    public void displayDetails(){
        System.out.println("name: "+ name+ "\n" + "enroll_no: "+ enroll_no+ "\n" + "cgpa: "+ cgpa );
    }
}
public class Q8 {
    public static void main(String[] args) {
        Details deet = new Details("Gauri",28,8.67);
        deet.displayDetails();
    }
    }

