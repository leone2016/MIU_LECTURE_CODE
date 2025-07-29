**Explanation of DIP Violation:**

In the code example:

* NotificationService (high-level module, handling the business logic of sending notifications) directly depends on EmailSender (low-level module, handling the detail of how to send an email).

* NotificationService instantiates EmailSender (new EmailSender();). This creates a tight coupling.

This violates DIP because the high-level module is directly tied to a specific low-level implementation. If you decide to switch from email to SMS, or use a different email library, you'd have to modify NotificationService. This makes the NotificationService inflexible and hard to test (you can't easily test it without actually sending an email).

Adhering to DIP (the Good Example)
To adhere to DIP, we introduce an abstraction (an interface) for the notification sending mechanism.



