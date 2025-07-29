package SWE.lesson5.solid_principles._5_dependency_inversion.good_design.notifapp2.base.impl;

import SWE.lesson5.solid_principles._5_dependency_inversion.good_design.notifapp2.base.MessageSender;

// Another Low-level module: Concrete SMSSender implements
// the same abstraction
public class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("SMSSender: Sending SMS to " + recipient + ": " + message);
        // Actual SMS sending logic (e.g., using Twilio API)
    }
}
