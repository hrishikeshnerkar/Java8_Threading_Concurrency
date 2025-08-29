package Java8.collect;

import java.util.List;
import java.util.stream.Collectors;

public class CollectUtilFunctionsApp {
    public static void main(String[] args) {
        List<String> playerNames = List.of("Azita", "lamar", "Maui");
        List<Integer> playerDamage = List.of(12,25,34,87,10,34,75,34);
        List<Double> playerDamageDouble = List.of(22.0, 06.0, 65.0,12.0,45.0,67.0,29.0,83.0);

        System.out.println("PlayerNames: " + String.join(",",playerNames));
        System.out.println("PlayerDamages: " + playerDamage.stream()
                        .map((damange -> damange.toString()))
                .collect(Collectors.joining(",")));

        Long numberOfHits = playerDamage.stream()
                .collect(Collectors.counting());
        System.out.println();
        System.out.println("Number of Hits: "+ numberOfHits);

        Integer overallDamage = playerDamage.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println();
        System.out.println("Overall Damage: " + overallDamage);

        Double overallDamageDouble = playerDamageDouble.stream()
                .collect(Collectors.summingDouble(Double::doubleValue));
        System.out.println();
        System.out.println("Overall Damage (double): " + overallDamageDouble);

        Double averageDamage = playerDamage.stream()
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println();
        System.out.println("Average Damage: " + averageDamage);

        System.out.println("Damage Statistics: "+ playerDamage.stream()
        .collect(Collectors.summarizingDouble(Integer::doubleValue))
        );
    }
}
