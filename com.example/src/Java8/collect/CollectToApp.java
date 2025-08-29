package Java8.collect;

import java.util.*;
import java.util.stream.Collectors;

public class CollectToApp {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "pineapple", "watermelon", "banana", "kiwi", "apple","kiwi");

        Set<String> availableFruits = fruits.stream()
                .collect(Collectors.toSet());
        // Set<Java8.String> availableFruits = new HashSet<>(fruits);
        System.out.println();
        System.out.println("Available fruits: " + availableFruits);

        Set<String> startWithChar = fruits.stream()
                .filter(fruit -> fruit.startsWith("w"))
                .collect(Collectors.toSet());
        System.out.println();
        System.out.println("Fruit starts with character: " + startWithChar);

        Collection<String> fruitBoxes = fruits.stream()
                .collect(Collectors.toCollection(LinkedList::new)); //Linkedlist will give duplicates elements
        System.out.println();
        System.out.println("Available fruits: " + fruitBoxes);

        //THis will give error, We cant have duplicate elements in Java8.map, adding new element cant override old element
        Map<String, String> fruitNamesWithUpperCase = fruits.stream()
                .distinct() //Adding this will solve the above issue
                .collect(Collectors.toMap(fruit -> fruit, fruit -> fruit.toUpperCase()));

        System.out.println();
        System.out.println("Fruit names with Uppercase: " + fruitNamesWithUpperCase);
    }
}
