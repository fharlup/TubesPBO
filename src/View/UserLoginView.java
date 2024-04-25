package View;

import Controler.UserController;

import javax.swing.*;
import java.awt.event.*;

public class UserLoginView extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;

    private UserController userController;

    public UserLoginView() {
        setTitle("User Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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

        loginButton = new JButton("Login");
        loginButton.setBounds(140, 150, 150, 25);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                if (userController.login(email, password)){
                    JOptionPane.showMessageDialog(null, "Login successful. Redirecting to homepage.");
                    System.out.println("homepage");
                    // ntar pindah
                } else {
                    JOptionPane.showMessageDialog(null, "Login failed. Please try again.");
                };
            }
        });
        panel.add(loginButton);

        getContentPane().add(panel);
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }
}
