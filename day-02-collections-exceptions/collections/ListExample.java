import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates usage of List for ordered collections.
 * Lists are commonly used when order matters and duplicates are allowed.
 */
public class ListExample {

    public static void main(String[] args) {

        List<String> users = new ArrayList<>();

        users.add("Alice");
        users.add("Bob");
        users.add("Alice"); // duplicates allowed

        for (String user : users) {
            System.out.println("User: " + user);
        }
    }
}
