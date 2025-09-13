package SWE.lesson5.solid_principles._1_single_responsibility.bad_design;

// Bad example: User class with multiple responsibilities
public class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    // Responsibility 1: User data management
    public void setPassword(String password) {
        this.password = password;
    }

    // Responsibility 2: User persistence
    public void saveUserToDatabase() {
        System.out.println("Saving user " + username + " to database...");
        // Logic to save user to database
    }

    // Responsibility 3: Sending welcome email
    public void sendWelcomeEmail() {
        System.out.println("Sending welcome email to " + email + "...");
        // Logic to send email
    }

    // Responsibility 4: User authentication
    public boolean authenticate(String username, String password) {
        // Logic to authenticate user
        return this.username.equals(username) && this.password.equals(password);
    }
}
