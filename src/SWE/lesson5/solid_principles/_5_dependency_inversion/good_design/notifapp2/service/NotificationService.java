package SWE.lesson5.solid_principles._5_dependency_inversion.good_design.notifapp2.service;


import SWE.lesson5.solid_principles._5_dependency_inversion.good_design.notifapp2.base.MessageSender;

// High-level module: NotificationService now
// depends on the abstraction (MessageSender)
public class NotificationService {
    private final MessageSender messageSender; // Dependency on abstraction

    // Constructor Injection: The dependency is "injected" from outside.
    // This is a common way to achieve DIP and promotes testability.
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendWelcomeNotification(String userContact) {
        // Business logic for welcome notification
        String message = "Welcome to our service!";
        // High-level module uses abstraction
        messageSender.sendMessage(userContact, message);
    }
}
