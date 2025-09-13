package SWE.lesson5.solid_principles._1_single_responsibility.bad_design;


// Using the User class (bad practice)
public class BadUserManagement {
    public static void main(String[] args) {
        User newUser = new User("john_doe", "password123", "john.doe@example.com");
        newUser.saveUserToDatabase();
        newUser.sendWelcomeEmail();
        boolean isAuthenticated = newUser.authenticate("john_doe", "password123");
        System.out.println("User authenticated: " + isAuthenticated);
    }
}
