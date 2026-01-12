public abstract class User {

    protected Long id;
    protected String name;
    protected String email;
    protected boolean active;

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = true;
    }

    public void deactivate() {
        this.active = false;
    }

    // Polymorphic method
    public abstract String getAccessLevel();

    public String getSummary() {
        return "User{id=" + id +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               ", active=" + active +
               ", accessLevel=" + getAccessLevel() +
               '}';
    }
}
