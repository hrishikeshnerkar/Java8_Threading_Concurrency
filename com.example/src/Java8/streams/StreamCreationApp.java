package Java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationApp{
    public static void main(String[] args){
        List<String> musicStyles = List.of("Rock", "Pop", "Jazz", "Classical", "Hip-Hop");
        musicStyles.stream()
                .sorted()
                .forEach(musicStyle -> {
                    System.out.println(musicStyle);
                });

        System.out.println("Using Method reference");
        // Using Method reference
        musicStyles.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        System.out.println(Stream.of("Rock", "Pop", "Jazz", "Classical", "Hip-Hop")
                .collect(Collectors.toList())
        );

        System.out.println("Number of elements in the array: "+
                Arrays.stream(new double[] {3,4,5.7,1.3,54.3}).count()
        );

        System.out.println("Numbers are printed 4 times");
        // Numbers are printed 4 times
        IntStream.range(1, 5)
                .forEach(number -> System.out.println(number + ". Being Right Sucks"));

        System.out.println("To print the indexes");
        //To print the indexes
        IntStream.range(0, musicStyles.size())
                .forEach(number -> System.out.println((number+1) + ". "+ musicStyles.get(number)));
    }
}