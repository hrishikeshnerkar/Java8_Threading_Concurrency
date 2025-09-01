package optional.newway;

import optional.Friend;
import optional.FriendFinderService;

import java.util.Optional;
import java.util.Scanner;

public class NewWayApp {
    public static void main(String[] args) {
        FriendFinderService friendFinderService = new FriendFinderService();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        Optional<Friend> friend = Optional.ofNullable(friendFinderService.findFriend(input.nextLine()));
        friend.ifPresentOrElse(System.out::println, ()-> System.out.println("Not found"));
    }
}