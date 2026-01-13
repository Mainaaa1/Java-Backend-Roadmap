/**
 * Demonstrates exception handling using try-catch-finally.
 */
public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            UserValidator.validateAge(16);
            System.out.println("User age is valid");
        } catch (InvalidAgeException ex) {
            System.out.println("Validation error: " + ex.getMessage());
        } finally {
            System.out.println("Validation attempt completed");
        }
    }
}
