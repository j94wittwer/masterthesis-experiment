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

    public void changePassword(User user, String oldPassword, String newPassword) {
        if (authenticate(user, user.getName(), oldPassword)) {
            user.setPassword(newPassword);
            System.out.println("Password changed successfully");
        } else {
            System.out.println("Old password does not match");
        }
    }

    public boolean authenticate(User user, String password, String username) {
        return user.getPassword() == password && user.getName() == username;
    }


}
