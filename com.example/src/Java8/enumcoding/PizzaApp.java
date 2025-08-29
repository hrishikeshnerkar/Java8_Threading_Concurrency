package Java8.enumcoding;

public class PizzaApp{
    public static void main(String[] args) {
        Pizza pizzaOrder = new Pizza("Margherita", PizzaSize.MEDIUM, 0);
        System.out.println("Ordered Pizza: " + pizzaOrder.getName());
        System.out.println("Size: " + pizzaOrder.getPizzaSize());
        System.out.println("Price: $" + pizzaOrder.getPrice());
    }
}