package SWE.lesson5.solid_principles._5_dependency_inversion.good_design.notifapp2.base.impl;

import SWE.lesson5.solid_principles._5_dependency_inversion.good_design.notifapp2.base.MessageSender;

// Low-level module: Concrete EmailSender implements the abstraction
public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("EmailSender: Sending email to " + recipient + ": " + message);
        // Actual email sending logic (e.g., using JavaMail API)
    }
}
