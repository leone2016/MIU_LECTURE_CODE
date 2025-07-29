package SWE.lesson5.solid_principles._5_dependency_inversion.bad_design.notifapp.lowlevelmodule;
// Bad Example: Violating Dependency Inversion Principle

// Low-level module: Concrete EmailSender
public class EmailSender {
    public void sendEmail(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
        // Actual email sending logic
    }
}
