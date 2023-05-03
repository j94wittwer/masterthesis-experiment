package LoginDelocalized;

public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public boolean authenticateUser(String username, String password) {
        User user = new User(username, password);
        boolean isAuthenticated = authenticationService.authenticate(user, username, password);
        if (isAuthenticated) {
            System.out.println("User " + username + " authenticated successfully.");
        } else {
            System.out.println("Authentication failed for user " + username);
        }
        return isAuthenticated;
    }

    public User createUser(String username, String password) {
        User newUser = authenticationService.createUser(username, password);
        if (newUser != null) {
            System.out.println("User " + username + " created successfully.");
        } else {
            System.out.println("User " + username + " already exists.");
        }
        return newUser;
    }

}
