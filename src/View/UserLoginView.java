package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import Controler.UserController;

public class UserLoginView extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private UserController userController;

    public UserLoginView() {
        setTitle("User Login");
        setSize(600, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();

                // Set rendering hints for smoother graphics
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

                // Create a translucent panel on the left side
                g2d.setColor(new Color(255, 255, 255, 150)); // White color with transparency
                g2d.fillRect(0, 0, getWidth() / 2, getHeight());
                g2d.dispose();
            }
        };

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel emailLabel = new JLabel("Email:");
        panel.add(emailLabel, gbc);

        gbc.gridy++;
        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel, gbc);

        gbc.gridy = 0;
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        emailField = new JTextField(20);
        panel.add(emailField, gbc);

        gbc.gridy++;
        passwordField = new JPasswordField(20);
        panel.add(passwordField, gbc);

        gbc.gridy++;
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                if (userController.login(email, password)){
                    JOptionPane.showMessageDialog(null, "Login successful. Redirecting to homepage.");
                    System.out.println("homepage");
                    HomePageView home = new HomePageView();
                    home.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Login failed. Please try again.");
                };
            }
        });
        panel.add(loginButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        gbc.fill = GridBagConstraints.BOTH;
        try {
            URL imageURL = new URL("https://i.pinimg.com/474x/3a/b1/85/3ab185bb27eaa85eb7fe6df7618d88a5.jpg");
            ImageIcon imageIcon = new ImageIcon(ImageIO.read(imageURL));
            JLabel imageLabel = new JLabel(imageIcon);
            panel.add(imageLabel, gbc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        getContentPane().add(panel);
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UserLoginView userLoginView = new UserLoginView();
            userLoginView.setVisible(true);
        });
    }
}
