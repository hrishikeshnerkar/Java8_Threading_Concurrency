import java.util.ArrayList;

public class WebShopApp {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 999.99, "High performance laptop"));
        productList.add(new Product("Smartphone", 499.99, "Latest model smartphone"));
        productList.add(new Product("Tablet", 299.99, "Portable tablet with stylus"));

        productList.add(1, new Product("Smartwatch", 199.99, "Smartwatch with health tracking") );
        productList.remove(2);

        productList.set(0, new Product("Rubber duck", 5.99, "You cant have bath without it"));

        for(Product product : productList){
            System.out.println(product);
        }
        System.out.println();
    }
}
