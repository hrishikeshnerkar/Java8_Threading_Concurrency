package Java8.MethodReferenceApp;

import java.util.Comparator;
import java.util.List;

public class MethodReferenceApp {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Steve", 40),
                new Person("Adam", 39),
                new Person("Anna", 27),
                new Person("Bob", 25),
                new Person("John", 56),
                new Person("Anna", 12));

        System.out.println("Using age");
        people.stream()
                .sorted((person1, person2) -> person1.getAge().compareTo(person2.getAge())) // Or else we can use .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Using name but on same name we check for age");
        people.stream()
                .sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Method reference using object");
        PersonComparisonProvider comparisonProvider = new PersonComparisonProvider();
        people.stream()
                .sorted(comparisonProvider::compareByNameAndAge)
                .forEach(System.out::println);
    }
}
