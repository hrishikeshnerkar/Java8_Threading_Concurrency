import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        System.out.println("Using HashMap to store product prices:");
        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("Apple", 0.99);
        productPrices.put("Banana", 0.59);
        productPrices.put("Orange", 0.79);
        productPrices.put("Mango", 1.49);
        productPrices.put("Grapes", 2.99);

        for (String product : productPrices.keySet()) {
            System.out.println("Product: " + product + ", Price: $" + productPrices.get(product));
        }

        System.out.println();
        System.out.println("Using LinkedHashMap to maintain insertion order:");

        Map<String, Double> productPrice = new LinkedHashMap<>();
        productPrice.put("Apple", 0.99);
        productPrice.put("Banana", 0.59);
        productPrice.put("Orange", 0.79);
        productPrice.put("Mango", 1.49);
        productPrice.put("Grapes", 2.99);

        for (String product : productPrice.keySet()) {
            System.out.println("Product: " + product + ", Price: $" + productPrice.get(product));
        }

        System.out.println();
        System.out.println(" Using TreeMap to sort products by name:");
        Map<String, Double> productPriceTreeMap = new TreeMap<>();
        productPriceTreeMap.put("Apple", 0.99);
        productPriceTreeMap.put("Banana", 0.59);
        productPriceTreeMap.put("Orange", 0.79);
        productPriceTreeMap.put("Mango", 1.49);
        productPriceTreeMap.put("Grapes", 2.99);

        for (String product : productPriceTreeMap.keySet()) {
            System.out.println("Product: " + product + ", Price: $" + productPriceTreeMap.get(product));
        }
        System.out.println();
    }
}
