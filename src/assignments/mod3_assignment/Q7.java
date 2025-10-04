package assignments.mod3_assignment;
class TicketCounter {
    private int ticketsAvailable = 5;
    public synchronized void bookTicket(String userName, int noOfTickets) {
        if (noOfTickets <= ticketsAvailable) {
            System.out.println(userName + " successfully booked " + noOfTickets + " ticket(s).");
            ticketsAvailable -= noOfTickets;
            System.out.println("Tickets left: " + ticketsAvailable);
        } else {
            System.out.println(userName + " tried to book " + noOfTickets + " ticket(s), but only "
                    + ticketsAvailable + " are available.");
        }
    }
}
class UserBooking implements Runnable {
    private TicketCounter counter;
    private String userName;
    private int ticketsToBook;

    public UserBooking(TicketCounter counter, String userName, int ticketsToBook) {
        this.counter = counter;
        this.userName = userName;
        this.ticketsToBook = ticketsToBook;
    }
    @Override
    public void run() {
        counter.bookTicket(userName, ticketsToBook);
    }
}

public class Q7 {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        Thread user1 = new Thread(new UserBooking(counter, "GAURI", 2));
        Thread user2 = new Thread(new UserBooking(counter, "SUHANA", 2));
        Thread user3 = new Thread(new UserBooking(counter, "KESHAV", 2));
        user1.start();
        user2.start();
        user3.start();
    }
}
