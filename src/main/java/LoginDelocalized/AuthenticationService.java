package LoginDelocalized;

public class AuthenticationService {

    public User createUser(String username, String password) {
        return new User(username, password);
    }

    public User changeUsername(User user, String newUsername) {
        if (newUsername == null || newUsername.isEmpty() || newUsername.trim().isEmpty()) {
            System.out.println("Please provide valid Username");
        } else {
            user.setName(newUsername);
        }
        return user;
    }

    public User changePassword(User user, String newPassword) {
        if (newPassword == null || newPassword.isEmpty() || newPassword.trim().isEmpty()) {
            System.out.println("Please provide valid Username");
        } else {
            user.setName(newPassword);
        }
        return user;
    }

    public boolean authenticate(User user, String password, String username) {
        return  user.getName() == username && user.getPassword() == password;
    }


}
