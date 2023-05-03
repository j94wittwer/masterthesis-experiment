package LoginDelocalized;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginControllerTest {

    @Test
    public void testLoginService() {
        String username = "alice";
        String password = "MyS4feP4ssw0rd";

        LoginController loginController = new LoginController(new AuthenticationService());

        assertTrue(loginController.authenticateUser(username, password));


    }

}
