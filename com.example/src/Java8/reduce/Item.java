package Java8.reduce;

public class Item {
    private String fruitName;
    private int quantity;
    private double price;

    public Item(String fruitName, int quantity, double price) {
        this.fruitName = fruitName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return fruitName + " - Qty: " + quantity + ", Price: " + price;
    }
}
