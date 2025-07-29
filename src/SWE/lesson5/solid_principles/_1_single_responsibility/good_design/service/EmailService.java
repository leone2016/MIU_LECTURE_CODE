package SWE.lesson5.solid_principles._1_single_responsibility.good_design.service;


import SWE.lesson5.solid_principles._1_single_responsibility.good_design.entity.User;

// Responsibility 3: Email sending
public class EmailService {
    public void sendWelcomeEmail(User user) {
        System.out.println("Sending welcome email to " + user.getEmail() + "...");
        // Actual logic to send an email (e.g., using JavaMail API)
    }
}
