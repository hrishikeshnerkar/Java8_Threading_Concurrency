package optional.empty;


import java.util.Optional;
import java.util.Scanner;

public class EmptyApp {
    public static void main(String[] args) {
        /**
         *

        Optional<String> nullStringOptional = null;
        nullStringOptional.ifPresentOrElse(System.out::println, ()-> System.out.println("Empty"));
         */

        Optional<String> emptyOptionalString = Optional.empty();
        emptyOptionalString.ifPresentOrElse(System.out::println,()-> System.out.println("Empty Optional"));

        FindFriendServiceEmpty findFriendServiceEmpty = new FindFriendServiceEmpty();
        Scanner scanner = new Scanner(System.in);

        findFriendServiceEmpty.findFriend(scanner.nextLine())
                .ifPresentOrElse(System.out::println, ()-> System.out.println("Not found"));
    }
}
