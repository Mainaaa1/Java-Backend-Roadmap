/**
 * Validates user-related input before processing.
 * Demonstrates throwing custom exceptions to enforce rules.
 */
public class UserValidator {

    public static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("User must be at least 18 years old");
        }
    }
}
