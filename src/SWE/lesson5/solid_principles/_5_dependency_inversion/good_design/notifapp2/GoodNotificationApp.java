package SWE.lesson5.solid_principles._5_dependency_inversion.good_design.notifapp2;


import SWE.lesson5.solid_principles._5_dependency_inversion.good_design.notifapp2.base.MessageSender;
import SWE.lesson5.solid_principles._5_dependency_inversion.good_design.notifapp2.base.impl.EmailSender;
import SWE.lesson5.solid_principles._5_dependency_inversion.good_design.notifapp2.base.impl.SMSSender;
import SWE.lesson5.solid_principles._5_dependency_inversion.good_design.notifapp2.service.NotificationService;

public class GoodNotificationApp {
    public static void main(String[] args) {
        // Injecting EmailSenderV2
        MessageSender emailSender = new EmailSender();
        NotificationService emailNotificationService = new NotificationService(emailSender);
        emailNotificationService.sendWelcomeNotification("alice@example.com");

        System.out.println("\n--- Switching to SMS Notification ---");

        // Injecting SMSSender without changing NotificationServiceV2
        MessageSender smsSender = new SMSSender();
        NotificationService smsNotificationService = new NotificationService(smsSender);
        smsNotificationService.sendWelcomeNotification("+1234567890");

        // Benefits:
        // - NotificationService is decoupled from concrete
        // sending mechanisms.
        // - Easily switch between email and SMS
        // (or add new types like Push, Slack, etc.)
        // - NotificationService is easier to test by
        // injecting mock MessageSender objects.
    }
}
