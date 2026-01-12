public class UserService {

    public void printUserSummary(User user) {
        // Polymorphism happens here
        System.out.println(user.getSummary());
    }
}
