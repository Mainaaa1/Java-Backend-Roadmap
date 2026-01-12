/**
 * NotificationService defines a contract for sending notifications.
 * Any class implementing this interface must provide an implementation for sendNotification().
 */
public interface NotificationService {

    /**
     * Sends a notification message to the specified recipient.
     *
     * @param recipient the recipient identifier (email, phone number, etc.)
     * @param message the message content
     */
    void sendNotification(String recipient, String message);
}
