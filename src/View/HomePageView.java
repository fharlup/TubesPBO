package View;

import javax.swing.*;

public class HomePageView extends JFrame {
    public HomePageView() {
        setTitle("Homepage");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("Homepage");
        label.setBounds(150, 100, 100, 25);
        panel.add(label);

        getContentPane().add(panel);
    }
}
