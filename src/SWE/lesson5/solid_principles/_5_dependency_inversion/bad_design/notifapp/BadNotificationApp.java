package SWE.lesson5.solid_principles._5_dependency_inversion.bad_design.notifapp;


import SWE.lesson5.solid_principles._5_dependency_inversion.bad_design.notifapp.highlevelmodule.NotificationService;

public class BadNotificationApp {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendWelcomeNotification("john.doe@example.com");

        // Problem: If we want to send SMS notifications instead
        // of emails,
        // or use a different email service provider,
        // we have to modify
        // the NotificationService class. This violates the
        // Open/Closed Principle
        // and makes the high-level module tightly coupled
        // to a low-level detail.

    }
}
