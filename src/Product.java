
@FunctionalInterface
interface ValidationRule{
    void checkPrice(double price);
}
public class Product {
    public static void main(String[] args) {
        ValidationRule Product  = (Price) -> {
            if(Price > 100) {
                System.out.println("Price is greater than 100");
            }};
        Product.checkPrice(200);
    }
}
