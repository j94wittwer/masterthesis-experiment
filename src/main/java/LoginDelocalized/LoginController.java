package LoginDelocalized;

public class LoginController {

    private AuthenticationService authenticationService;
    private UserRepository userRepository;

    public LoginController(AuthenticationService authenticationService, UserRepository userRepository) {
        this.authenticationService = authenticationService;
        this.userRepository = userRepository;
    }

    public boolean authenticateUser(String username, String password) {
        User user = userRepository.getUserByUsername(username);
        boolean isAuthenticated = false;
        if (user != null) {
            isAuthenticated = authenticationService.authenticate(user, username, password);
        } else {
            System.out.println("User does not exist.");
        }
        return isAuthenticated;
    }

    public void createUser(String username, String password) {
        User newUser = authenticationService.createUser(username, password);
        userRepository.addUser(newUser);
    }

    public void changePassword(String username, String oldPassword, String newPassword) {
        User user = userRepository.getUserByUsername(username);
        authenticationService.changePassword(user, oldPassword, newPassword);
    }

}
