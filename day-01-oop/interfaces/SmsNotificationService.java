/**
 * Sends notifications via SMS.
 */
public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification(String recipient, String message) {
        // Simulated SMS sending
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
