package streams.Distinct;

import org.w3c.dom.ls.LSOutput;

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
                "Papaya"
        );

        List<String> availableFruits = fruits.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Available Fruits"+availableFruits);
    }
}
