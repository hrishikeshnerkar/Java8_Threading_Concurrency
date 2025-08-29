package Java8.streams.Distinct;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctApp {
    public static void main(String[] args) {
        List<String> fruits = List.of(
                "Apple","Banana","Cherry","Mango",
                "Pineapple",
                "Strawberry",
                "Blueberry",
                "Watermelon",
                "Kiwi",
                "Papaya","Apple","Banana","Cherry","Mango",
                "Pineapple",
                "Strawberry"
        );

        List<String> availableFruits = fruits.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Available Fruits"+availableFruits);
    }
}
