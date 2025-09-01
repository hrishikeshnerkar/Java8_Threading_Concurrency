package optional.isempty;

import optional.Friend;
import optional.empty.FindFriendServiceEmpty;

import java.util.Optional;
import java.util.Scanner;

public class IsEmptyApp {
    public static void main(String[] args) {
        FindFriendServiceEmpty findFriendServiceEmpty = new FindFriendServiceEmpty();
        Scanner userInput = new Scanner(System.in);

        Optional<Friend> friend = findFriendServiceEmpty.findFriend(userInput.nextLine());
        if(friend.isEmpty()) {
            System.out.println("Not found");
        }else  {
            System.out.println(friend.get());
        }
    }
}
