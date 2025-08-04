import java.util.Hashtable;

public class HashTableApp {
    public static void main(String[] args) {
        Hashtable<String, Double> productPrice = new Hashtable<>();

        productPrice.put("Apple", 1.20);
        productPrice.put("Banana", 0.80);
        productPrice.put("Cherry", 2.50);
        System.out.println(productPrice);
    }
}
