package controller;

import model.User;
import view.UserView;

public class UserController {
    private User user;
    private UserView userView;

    public UserController(User user, UserView userView) {
        this.user = user;
        this.userView = userView;
    }

    public void createUser(String username, String email) {
        user.setUsername(username);
        user.setEmail(email);
        userView.displayUserInfo(user);
    }
}