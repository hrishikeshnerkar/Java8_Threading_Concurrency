import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        Set<String> carBrands = new HashSet<>();
        carBrands.add("Toyota");
        carBrands.add("Honda");
        carBrands.add("Ford");
        carBrands.add("BMW");

        System.out.println(carBrands);
        System.out.println("Does the set contain 'Honda'? " + carBrands.contains("Honda"));
        System.out.println("The size of the set is: " + carBrands.size());
        System.out.println("Removing 'Ford' from the set." + carBrands.remove("Ford"));
        System.out.println(carBrands);

        System.out.println();
        System.out.println("Iterating through the car models:");
        for (String brand : carBrands) {
            System.out.println("-" + brand.toUpperCase());
        }
    }
}
