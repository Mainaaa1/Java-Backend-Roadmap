import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates usage of Map for key-value relationships.
 * Maps are heavily used in caching and lookups.
 */
public class MapExample {

    public static void main(String[] args) {

        Map<Long, String> userMap = new HashMap<>();

        userMap.put(1L, "Alice");
        userMap.put(2L, "Bob");

        System.out.println("User with ID 1: " + userMap.get(1L));

        for (Map.Entry<Long, String> entry : userMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
