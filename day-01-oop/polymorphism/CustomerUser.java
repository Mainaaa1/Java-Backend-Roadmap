public class CustomerUser extends User {

    private int loyaltyPoints;

    public CustomerUser(Long id, String name, String email) {
        super(id, name, email);
        this.loyaltyPoints = 0;
    }

    @Override
    public String getAccessLevel() {
        return "CUSTOMER_ACCESS";
    }

    public void addLoyaltyPoints(int points) {
        if (points > 0) {
            loyaltyPoints += points;
        }
    }
}
