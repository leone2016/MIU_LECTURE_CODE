package SWE.lesson5.solid_principles._1_single_responsibility.good_design;


import SWE.lesson5.solid_principles._1_single_responsibility.good_design.entity.User;
import SWE.lesson5.solid_principles._1_single_responsibility.good_design.repository.UserRepository;
import SWE.lesson5.solid_principles._1_single_responsibility.good_design.service.EmailService;
import SWE.lesson5.solid_principles._1_single_responsibility.good_design.service.UserAuthenticatorService;

public class GoodUserMgmtApp {
    public static void main(String[] args) {
        User newUser = new User("jane_doe", "securepass", "jane.doe@example.com");

        UserRepository userRepository = new UserRepository();
        userRepository.saveUser(newUser);

        EmailService emailService = new EmailService();
        emailService.sendWelcomeEmail(newUser);

        UserAuthenticatorService authenticator = new UserAuthenticatorService();
        boolean isAuthenticated = authenticator
                .authenticate(newUser, "jane_doe", "securepass");
        System.out.println("User authenticated: " + isAuthenticated);

        // Example of finding a user and then performing operations
        User retrievedUser = userRepository.findByUsername("jane_doe");
        if (retrievedUser != null) {
            emailService.sendWelcomeEmail(retrievedUser);
        }
    }
}
