import Controler.UserController;
import Model.*;
import View.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            UserView userView = new UserView();
            UserController userController = new UserController(new UserModel());
            userView.setUserController(userController); // Set the UserController
            userView.setVisible(true);
            }
        });
    }

}

