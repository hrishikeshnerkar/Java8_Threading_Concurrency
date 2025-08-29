package Java8.skip_limit;

import Java8.reduce.Item;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimitApp {
    public static void main(String[] args) {

        List<Item> fruitBoxes = List.of(
                new Item("Strawberry", 10, 43),
                new Item("Apple", 5, 30),
                new Item("Banana", 12, 15),
                new Item("Mango", 8, 50),
                new Item("Pineapple", 2, 60),
                new Item("Grapes", 6, 25),
                new Item("Orange", 7, 20),
                new Item("Papaya", 3, 35),
                new Item("Watermelon", 1, 80),
                new Item("Kiwi", 4, 40)
        );

        List<Item> top3LeastExp = fruitBoxes.stream()
                .sorted(Comparator.comparing(Item::getPrice))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println();
        System.out.println("Top 3 Least Exp: " + top3LeastExp);


        List<Item> top3MostExp = fruitBoxes.stream()
                .sorted(Comparator.comparing(Item::getPrice).reversed())
                .skip(1)// no element is removed
                .limit(3)
                //.skip(1) //element is removed if we used here
                .collect(Collectors.toList());

        System.out.println();
        System.out.println("Top 3 Most Exp: " + top3MostExp);

    }
}
