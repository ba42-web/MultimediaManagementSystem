package view;

import model.User;

public class UserView {
    public void displayUserInfo(User user) {
        System.out.println("User Info: ");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
    }
}