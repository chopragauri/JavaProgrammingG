package mod1_assignment;
class Singleton {
    private static Singleton instance;
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
public class Q41 {
        public static void main(String[] args) {

            Singleton obj1 = Singleton.getInstance();
            Singleton obj2 = Singleton.getInstance();

            if (obj1 == obj2) {
                System.out.println("Both objects are the same instance.");
            } else {
                System.out.println("Different instances.");
            }
            obj1.showMessage();
        }
    }


