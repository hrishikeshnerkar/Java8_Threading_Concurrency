package Java8.streams.Filtering;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterApp {
    public static void main(String[] args) {
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
        System.out.println("Using filter");
        cereals.stream()
                .filter(cereal-> cereal.getRating()>4.5) // .filter(cereal-> cereal.getBrand().equals("ABC"))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Using forEach");
        List<Product> cheapCereals = new ArrayList<>();
        cereals.stream()
                .filter(cereal -> cereal.getPrice()<8)
                .forEach(cheapCereals::add);
        System.out.println(cheapCereals);

        System.out.println();
        System.out.println("Using forEach on Map");
        Map<Integer, Product> smartWatches = new HashMap<>();
        smartWatches.put(1, new Product("Fitness Tracker", "Oxygen", 199.9, 4.7));
        smartWatches.put(2, new Product("Pulse Pro", "FitTech", 249.99, 4.5));
        smartWatches.put(3, new Product("ActiveBand", "WellnessCo", 179.49, 4.3));
        smartWatches.put(4, new Product("SmartCore X", "NeoGear", 299.0, 4.8));
        smartWatches.put(5, new Product("TrackMate", "BioPulse", 159.99, 4.2));
        smartWatches.put(6, new Product("VitaWatch", "BioPulse", 219.75, 4.6));

        smartWatches.entrySet().stream()
                .filter(product -> product.getValue() != null && product.getValue().getBrand().equals("BioPulse"))
                .forEach(product -> System.out.println(product.getValue().getName() + " - " + product.getValue().getBrand()+" - $"+ product.getValue().getPrice()));
    }
}
