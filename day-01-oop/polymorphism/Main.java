public class Main {

    public static void main(String[] args) {

        User admin = new AdminUser(1L, "System Admin", "admin@example.com");
        User customer = new CustomerUser(2L, "Ian Maina", "ian@example.com");

        UserService userService = new UserService();

        userService.printUserSummary(admin);
        userService.printUserSummary(customer);
    }
}
