import java.util.HashSet;
import java.util.Set;

/**
 * Demonstrates usage of Set for unique data.
 * Sets are useful when duplicates must be prevented.
 */
public class SetExample {

    public static void main(String[] args) {

        Set<String> roles = new HashSet<>();

        roles.add("ADMIN");
        roles.add("USER");
        roles.add("ADMIN"); // ignored (duplicate)

        for (String role : roles) {
            System.out.println("Role: " + role);
        }
    }
}
