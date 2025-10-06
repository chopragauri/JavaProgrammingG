package labExp.Oct6;
abstract class Book{
    String title;
    String author;
    Double price;

    Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
class Book1 extends Book{
    Book1(String title, String author, Double price) {
        super(title, author, price);
    }
}
class FictionBook extends Book {
    String genre;

    FictionBook(String title, String author, Double price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    @Override
    void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Genre: " + genre);
    }
}
class NonFictionBook extends Book {
    private String subject;

    public NonFictionBook(String title, String author, double price, String subject) {
        super(title, author, price);
        this.subject = subject;
    }

    @Override
    public void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Subject: " + subject);
    }
}
//    public class Q1 {
//        public static void main(String[] args) {
//            Book1 book1 = new Book1("Book 1", "Author 1", 50.00);
//            book1.getDetails();
//            FictionBook book2 = new FictionBook("Title 2","Gauri",100000.0, "RomCom");
//            book2.getDetails();
//            NonFictionBook book3 = new NonFictionBook("Title 3","Suhana",100.0, "GenAI");
//            book3.getDetails();
//        }
//    }
public class BookstoreInventory {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new FictionBook("Book 1", "Gauri", 350.0, "RomCom");
        books[1] = new FictionBook("Harry Potter", "Suhana", 499.0, "Fantasy");
        books[2] = new NonFictionBook("Sapiens", "Yuval Noah Harari", 600.0, "History");
        books[3] = new NonFictionBook("Atomic Habits", "James Clear", 399.0, "Self Help");
        for (Book book : books) {
            System.out.println("\n");
            book.getDetails();
        }
    }
}
