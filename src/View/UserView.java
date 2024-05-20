package View;

import Controler.UserController;
import Model.UserModel;

import javax.swing.*;
import java.awt.event.*;

public class UserView extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JComboBox<String> roleComboBox;
    private JButton registerButton;
    private JButton loginButton;

    private UserController userController;

    
    
    public UserView() {
        
        
        setTitle("User Registration");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 50, 80, 25);
        panel.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(140, 50, 200, 25);
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 80, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(140, 100, 200, 25);
        panel.add(passwordField);

        JLabel roleLabel = new JLabel("Role:");
        roleLabel.setBounds(50, 150, 80, 25);
        panel.add(roleLabel);

        String[] roles = {"Donatur", "Organisasi"};
        roleComboBox = new JComboBox<>(roles);
        roleComboBox.setBounds(140, 150, 200, 25);
        panel.add(roleComboBox);

        registerButton = new JButton("Register");
        registerButton.setBounds(140, 200, 150, 25);
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String role = (String) roleComboBox.getSelectedItem();
                userController.register(email, password, role);
            }
        });
        panel.add(registerButton);

        loginButton = new JButton("Login");
        loginButton.setBounds(140, 250, 150, 25);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openLoginPage();
                dispose();
            }
        });
        panel.add(loginButton);

        getContentPane().add(panel);
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    private void openLoginPage() {
        UserLoginView loginView = new UserLoginView();
        loginView.setUserController(userController);
        loginView.setTitle("User Login");
        loginView.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UserView userView = new UserView();
                UserController userController = new UserController(new UserModel());
                userView.setUserController(userController);
                userView.setVisible(true);
               // System.out.println("test");
            }
        });
    }
}
