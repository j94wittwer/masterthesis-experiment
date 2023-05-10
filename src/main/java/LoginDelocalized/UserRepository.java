package LoginDelocalized;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
        } else {
            System.out.println("User is already in repository.");
        }
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getName() == username) {
                return user;
            }
        }
        return null;
    }

    public void removeUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
        } else {
            System.out.println("User is not existent in repository.");
        }
    }


}
