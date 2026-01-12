public class CustomerUser extends User {

    private int loyaltyPoints;

    public CustomerUser(Long id, String name, String email) {
        super(id, name, email);
        this.loyaltyPoints = 0;
    }

    public void addLoyaltyPoints(int points) {
        if (points > 0) {
            this.loyaltyPoints += points;
        }
    }

    public String getCustomerDetails() {
        return getUserSummary() + ", loyaltyPoints=" + loyaltyPoints;
    }
}
