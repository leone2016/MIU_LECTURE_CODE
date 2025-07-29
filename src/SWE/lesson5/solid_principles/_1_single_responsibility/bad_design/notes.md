In this bad example, the User class is responsible for:

1. Managing user data (username, password, email).

2. Saving user data to a database.

3. Sending welcome emails.

4. Authenticating users.

If we need to change how users are saved (e.g., from SQL to NoSQL), we have to modify the User class. If we change the email sending service, we also modify the User class. This violates Single Responsibility Principle.