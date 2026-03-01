package MultimediaManagementSystemProject;

import controller.UserController;
import controller.MediaController;
import model.User;
import model.Media;
import view.UserView;
import view.MediaView;

public class MultimediaManagementSystemProject {

    public static void main(String[] args) {
        // Create view objects
        UserView userView = new UserView();
        MediaView mediaView = new MediaView();

        // Create model objects
        User user = new User(1, "JohnDoe", "johndoe@email.com", "Admin");
        Media media = new Media(101, "sample.jpg", "image", 2.5, user);

        // Create controller objects
        UserController userController = new UserController(user, userView);
        MediaController mediaController = new MediaController(media, mediaView);

        // Create a user and display user info
        userController.createUser("JohnDoe", "johndoe@email.com");

        // Display media info
        mediaController.displayMediaInfo();
    }
}