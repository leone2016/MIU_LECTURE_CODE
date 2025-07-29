package SWE.lesson5.solid_principles._5_dependency_inversion.bad_design.notifapp.highlevelmodule;


import SWE.lesson5.solid_principles._5_dependency_inversion.bad_design.notifapp.lowlevelmodule.EmailSender;

// High-level module: NotificationService directly depends
// on EmailSender
public class NotificationService {

    // Direct dependency on concrete class
    private EmailSender emailSender;

    public NotificationService() {
        // High-level module creates low-level dependency
        this.emailSender = new EmailSender();
    }

    public void sendWelcomeNotification(String userEmail) {
        // Business logic for welcome notification
        String message = "Welcome to our service, " + userEmail + "!";
        // High-level module uses low-level concrete implementation
        emailSender.sendEmail(userEmail, message);
    }
}
