import java.util.*;

/**
 * Simulates a service layer managing users in memory.
 * This mirrors how repositories and services interact in backend systems.
 */
public class CollectionService {

    private final List<String> users = new ArrayList<>();
    private final Set<String> roles = new HashSet<>();
    private final Map<Long, String> userDirectory = new HashMap<>();

    public void addUser(Long id, String name) {
        users.add(name);
        userDirectory.put(id, name);
    }

    public void addRole(String role) {
        roles.add(role);
    }

    public List<String> getAllUsers() {
        return users;
    }

    public String getUserById(Long id) {
        return userDirectory.get(id);
    }

    public Set<String> getRoles() {
        return roles;
    }

    public static void main(String[] args) {

        CollectionService service = new CollectionService();

        service.addUser(1L, "Alice");
        service.addUser(2L, "Bob");
        service.addRole("ADMIN");
        service.addRole("USER");

        System.out.println("All users: " + service.getAllUsers());
        System.out.println("User with ID 2: " + service.getUserById(2L));
        System.out.println("Roles: " + service.getRoles());
    }
}
