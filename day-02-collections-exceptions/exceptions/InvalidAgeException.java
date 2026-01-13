/**
 * Custom unchecked exception used to indicate invalid age input.
 * Extends RuntimeException to avoid mandatory try-catch at every call site.
 */
public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String message) {
        super(message);
    }
}
