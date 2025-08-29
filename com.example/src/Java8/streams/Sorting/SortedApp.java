package Java8.streams.Sorting;

import Java8.streams.Filtering.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedApp {
    public static void main(String[] args) {
        List<Integer> lotteryNumbers = List.of(34,56,76,25,9,53,42,96);

        System.out.println("Sorting the Data");
        System.out.println(lotteryNumbers.stream()
                .sorted()
                .collect(Collectors.toList()));

        System.out.println();
        System.out.println("Revered using comparator");
        System.out.println(lotteryNumbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));

        List<Product> cereals = List.of(
                new Product("Captain Crunch", "ABC", 9.99, 4.7),
                new Product("Barn Flaks", "Old Oats", 8.59, 4.6),
                new Product("Honey Rings", "SweetCo", 7.49, 4.5),
                new Product("Choco Pops", "Crispy Corp", 6.99, 4.2),
                new Product("Nutty Nuggets", "GrainWorks", 8.25, 4.8),
                new Product("Frosty Bites", "CoolCereal", 7.95, 4.3),
                new Product("Golden Crunch", "Sunrise Foods", 9.10, 4.6)
        );

        System.out.println();
        System.out.println("Sorting the Objects");
        cereals.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);
    }
}
