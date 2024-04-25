import Controler.UserController;
import Model.*;
import View.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UserView userView = new UserView();
                userView.setVisible(true);
            }
        });
    }
}

