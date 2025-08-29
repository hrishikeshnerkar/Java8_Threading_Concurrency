package Java8.reduce;

import java.util.List;

public class ReduceApp {
    public static void main(String[] args) {

        List<Item> shoppingCart = List.of(
                new Item("strawberry", 10, 15),
                new Item("Apple", 5, 20),
                new Item("Banana", 12, 5),
                new Item("Mango", 3, 30)
        );

        double subTotal = shoppingCart.stream()
                .mapToDouble(Item::getPrice)
                .sum();

        double discount = -10;
        double totalPrice = shoppingCart.stream()
                .map(Item::getPrice)
                .reduce(discount, Double::sum);

        System.out.println();
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Discount: " + discount);
        System.out.println("Total price: " + totalPrice);

    }
}
