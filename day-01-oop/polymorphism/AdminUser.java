public class AdminUser extends User {

    public AdminUser(Long id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getAccessLevel() {
        return "FULL_ADMIN_ACCESS";
    }

    public void performSystemAudit() {
        System.out.println("Admin performing system audit");
    }
}
