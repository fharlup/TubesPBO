package View;

import Model.Donatur;

import javax.swing.*;
import java.awt.event.*;

public class UserView extends JFrame {
    private JTextField emailField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton createAccountButton;

    public UserView() {
        setTitle("Create Donatur Account");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 50, 80, 25);
        panel.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(140, 50, 200, 25);
        panel.add(emailField);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 100, 80, 25);
        panel.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(140, 100, 200, 25);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 150, 80, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(140, 150, 200, 25);
        panel.add(passwordField);

        createAccountButton = new JButton("Create Account");
        createAccountButton.setBounds(140, 200, 150, 25);
        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (email.isEmpty() || username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    createUserAccount(email, username, password);
                }
            }
        });
        panel.add(createAccountButton);

        getContentPane().add(panel);
    }

    private void createUserAccount(String email, String username, String password) {
        Donatur donatur = new Donatur("D123", email, username, password);
        donatur.createAccount();
        JOptionPane.showMessageDialog(this, "Account created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UserView userView = new UserView();
                userView.setVisible(true);
            }
        });
    }
}
