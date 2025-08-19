public class Pizza {
    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name, PizzaSize pizzaSize, double price) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatedPrice();
    }

    private double calculatedPrice() {
        switch(pizzaSize){
            case SMALL:
                return 8.99;
            case MEDIUM:
                return 10.99;
            case LARGE:
                return 12.99;
            default:
                throw new IllegalArgumentException("Unknown pizza size: " + pizzaSize);
        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public double getPrice() {
        return price;
    }
    
}
