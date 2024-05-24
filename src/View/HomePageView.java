package View;

import javax.swing.*;
import java.awt.*;
import java.net.*;

public class HomePageView extends JFrame {
    public HomePageView() {
        setTitle("Homepage");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Load image from URL
        try {
            String imageUrl = "https://i.pinimg.com/474x/3a/b1/85/3ab185bb27eaa85eb7fe6df7618d88a5.jpg";
            ImageIcon imageIcon = new ImageIcon(new URL(imageUrl));
            JLabel imageLabel = new JLabel(imageIcon);
            panel.add(imageLabel, BorderLayout.CENTER);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        JLabel titleLabel = new JLabel("UPDATE NEWS", SwingConstants.CENTER);
        panel.add(titleLabel, BorderLayout.SOUTH);

        
        JPanel newsPanel = new JPanel(new GridLayout(2, 2));
        JButton news1Button = new JButton("News 1");
        JButton news2Button = new JButton("News 2");
        JButton news3Button = new JButton("News 3");
        JButton news4Button = new JButton("News 4");
        newsPanel.add(news1Button);
        newsPanel.add(news2Button);
        newsPanel.add(news3Button);
        newsPanel.add(news4Button);
        panel.add(newsPanel, BorderLayout.SOUTH);

        getContentPane().add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HomePageView homePageView = new HomePageView();
            homePageView.setVisible(true);
        });
    }
}
