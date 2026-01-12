/**
 * Sends notifications via email.
 */
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String recipient, String message) {
        // Simulated email sending
        System.out.println("Sending Email to " + recipient + ": " + message);
    }
}
