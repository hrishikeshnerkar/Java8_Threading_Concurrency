import java.util.HashSet;
import java.util.Set;

public class HashSetOperations {
    public static void main(String[] args) {
        Set<String> carBrands = new HashSet<>();
        carBrands.add("Toyota");
        carBrands.add("Honda");
        carBrands.add("Ford");
        carBrands.add("BMW");
        System.out.println("Initial car brands: " + carBrands);

        Set<String> newCarBrands = new HashSet<>();
        newCarBrands.add("Audi");
        newCarBrands.add("Mercedes");
        newCarBrands.add("Tesla");
        newCarBrands.add("Fiaat");
        carBrands.addAll(newCarBrands);
        System.out.println("After adding new car brands: " + carBrands);
    }
}
