/**
 * Demonstrates programming to an interface.
 * The client code depends on NotificationService, not a concrete implementation.
 */
public class NotificationClient {

    private final NotificationService notificationService;

    // Constructor injection
    public NotificationClient(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String recipient, String message) {
        notificationService.sendNotification(recipient, message);
    }

    public static void main(String[] args) {

        // Using Email implementation
        NotificationService emailService = new EmailNotificationService();
        NotificationClient emailClient = new NotificationClient(emailService);
        emailClient.notifyUser("jane.doe@example.com", "Welcome to the platform!");

        // Using SMS implementation
        NotificationService smsService = new SmsNotificationService();
        NotificationClient smsClient = new NotificationClient(smsService);
        smsClient.notifyUser("+1234567890", "Your OTP is 123456");
    }
}
