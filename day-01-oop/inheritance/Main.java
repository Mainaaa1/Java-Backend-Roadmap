public class Main {

    public static void main(String[] args) {

        AdminUser admin = new AdminUser(1L, "System Admin", "admin@example.com");
        CustomerUser customer = new CustomerUser(2L, "Jane Doe", "jane@example.com");

        customer.addLoyaltyPoints(50);

        System.out.println(customer.getCustomerDetails());

        admin.suspendUser(customer);

        System.out.println(customer.getCustomerDetails());
    }
}
