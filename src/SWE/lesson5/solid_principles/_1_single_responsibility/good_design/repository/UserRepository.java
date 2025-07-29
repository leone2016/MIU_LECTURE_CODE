package SWE.lesson5.solid_principles._1_single_responsibility.good_design.repository;


import SWE.lesson5.solid_principles._1_single_responsibility.good_design.entity.User;

// Responsibility 2: User persistence
public class UserRepository {
    public void saveUser(User user) {
        System.out.println("Saving user " + user.getUsername() + " to database...");
        // Actual logic to save user to a database (e.g., JDBC, JPA)
    }

    public User findByUsername(String username) {
        System.out.println("Finding user " + username + " from database...");
        // Actual logic to retrieve user from database
        return new User(username, "retrievedPassword", "retrievedEmail"); // Placeholder
    }
}
