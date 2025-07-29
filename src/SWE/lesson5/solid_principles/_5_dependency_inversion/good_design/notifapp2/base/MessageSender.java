package SWE.lesson5.solid_principles._5_dependency_inversion.good_design.notifapp2.base;
// Good Example: Adhering to Dependency Inversion Principle

// Abstraction: Interface for sending notifications
public interface MessageSender {
    void sendMessage(String recipient, String message);
}
