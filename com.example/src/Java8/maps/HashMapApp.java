package Java8.maps;

import java.util.*;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        capitals.put("Germany", "Berlin");
        capitals.put("India", "New Delhi");
        capitals.put("Brazil", "Brasília");
        System.out.println("The capitals of USA is " + capitals.get("USA"));

        if (capitals.containsKey("India")) {
            System.out.println("India's capital is " + capitals.get("India"));
        } else {
            System.out.println("Capital of India not found.");
        }

        System.out.println(capitals.getOrDefault("England", "The capital is not available."));

        capitals.putIfAbsent("India", "China");
        capitals.remove(null);
        System.out.println("The following countries can be found in the hashmap");

        for (String country : capitals.keySet()) {
            System.out.println("-" + country);
        }

        System.out.println(capitals.size() + " the following capitals can be found in the hashmap");
        for (String capital : capitals.values()) {
            System.out.println("-" + capital);
        }
    }
}
