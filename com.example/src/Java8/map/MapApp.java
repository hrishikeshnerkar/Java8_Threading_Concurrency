package Java8.map;

import Java8.streams.Filtering.Product;

import java.util.List;
import java.util.stream.Collectors;

public class MapApp {
    public static void main(String[] args) {

        List<String> names = List.of("aladdin", "clara", "Cesar", "polly");
        List<String> nameCapital = names.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("Captial"+ nameCapital);

        List<Product> cereals = List.of(
                new Product("Captain Crunch", "ABC", 9.99, 4.7),
                new Product("Barn Flaks", "Old Oats", 8.59, 4.6),
                new Product("Honey Rings", "SweetCo", 7.49, 4.5),
                new Product("Choco Pops", "Crispy Corp", 6.99, 4.2),
                new Product("Nutty Nuggets", "GrainWorks", 8.25, 4.8),
                new Product("Frosty Bites", "CoolCereal", 7.95, 4.3),
                new Product("Golden Crunch", "Sunrise Foods", 9.10, 4.6)
        );

        List<String> cerealsName = cereals.stream()
                .map(Product::getName)
                //.Java8.map(cereal -> cereal.getName())
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("CerealsName"+ cerealsName);

        List<Product> increasePriceProduct = cereals.stream()
                .map(product -> new Product(
                        product.getName(),
                        product.getBrand(),
                        product.getPrice(),
                        product.getRating()
                ))
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("IncreasePriceProduct"+ increasePriceProduct);
    }
}
