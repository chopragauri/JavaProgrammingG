package assignments.mod3_assignment;
import java.util.Date;
import java.util.Calendar;
public class Q24 {
        public static void main(String[] args) {

            Date currentDate = new Date();
            System.out.println("Current Date and Time using Date class: " + currentDate);

            Calendar calendar = Calendar.getInstance();
            System.out.println("Current Date using Calendar class: " + calendar.getTime());
        }
    }

