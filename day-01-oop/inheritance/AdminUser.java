public class AdminUser extends User {

    private String role;

    public AdminUser(Long id, String name, String email) {
        super(id, name, email);
        this.role = "ADMIN";
    }

    public void suspendUser(User user) {
        user.deactivate();
        System.out.println("Admin suspended user: " + user.name);
    }

    public String getAdminDetails() {
        return getUserSummary() + ", role=" + role;
    }
}
