package SWE.lesson5.solid_principles._1_single_responsibility.good_design.service;


import SWE.lesson5.solid_principles._1_single_responsibility.good_design.entity.User;

// Responsibility 4: User authentication
public class UserAuthenticatorService {
    public boolean authenticate(User user, String username, String password) {
        System.out.println("Authenticating user " + username + "...");
        // Actual authentication logic (e.g., comparing hashed passwords)
        return user.getUsername().equals(username) && user.getPassword().equals(password);
    }
}
