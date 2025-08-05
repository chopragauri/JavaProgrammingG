package mod1_assignment;
class AccessExample {
    private String privateVar = "Private - Only in this class";
    String defaultVar = "Default - Accessible in same package";
    protected String protectedVar = "Protected - Subclasses & same package";
    public String publicVar = "Public - Accessible from anywhere";

    public void showAccess() {
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}
public class Q9 {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        obj.showAccess();  // all accessible within same class
        // Outside the class, privateVar is not accessible:
        // System.out.println(obj.privateVar);
        System.out.println("\nAccessing from main():");
        // System.out.println(obj.privateVar);  // Not allowed
        System.out.println(obj.defaultVar);     // Allowed (same package)
        System.out.println(obj.protectedVar);   // Allowed (same package)
        System.out.println(obj.publicVar);      // Allowed
    }
}

