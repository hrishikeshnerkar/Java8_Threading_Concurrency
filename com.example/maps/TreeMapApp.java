import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapApp {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();
        map.put("Apple", 1.20);
        map.put("Banana", 0.80);
        map.put("Cherry", 2.50);
        map.put("Date", 3.00);
        map.put("Elderberry", 1.50);
        map.put("Fig", 2.00);
        map.put("Grape", 1.80);
        map.put("Honeydew", 3.50);

        System.out.println("the first item in the TreeMap: " + map.firstKey());
        System.out.println();
        System.out.println("Items in the TreeMap:");
        for (String key : map.keySet()) { // iterate through keys
            System.out.println(key + ": $" + map.get(key));
        }

        System.out.println("\nItems in the TreeMap in descending order:");
        for (String key : map.descendingKeySet()) { // iterate through keys in descending order
            System.out.println(key + ": $" + map.get(key));
        }

        System.out.println("\nUsing NavigableMap to get items in descending order:");
        NavigableMap<String, Double> productPriceDecMap = map.descendingMap();
        for (String product : productPriceDecMap.keySet()) {
            System.out.println(product + ": $" + productPriceDecMap.get(product));
        }

        System.out.println();
        System.out.println("lower key :" + map.lowerKey("Grape"));
        System.out.println("floor key :" + map.floorKey("Grape"));
        System.out.println("higher key :" + map.higherKey("Grape"));
        System.out.println("ceiling key :" + map.ceilingKey("Grape"));
    }
}
