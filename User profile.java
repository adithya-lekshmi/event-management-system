import javax.swing.*;
import java.awt.*;

public class UserProfileFrame extends JFrame {
    public UserProfileFrame() {
        setTitle("User Profile");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 500);
        setLayout(null);

        // Panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 51, 102)); // Dark Blue
        panel.setBounds(20, 20, 350, 420);
        panel.setLayout(null);
        add(panel);

        // Title Label
        JLabel titleLabel = new JLabel("USER PROFILE");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 18));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(120, 10, 200, 30);
        panel.add(titleLabel);

        // Load user profile image
        String imagePath = "C:/Users/YourName/Pictures/WhatsApp Image 2025-04-03 at 21.20.19.jpeg"; // Update with your correct image path
        ImageIcon profilePic = new ImageIcon(imagePath);
        Image img = profilePic.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel profileLabel = new JLabel(new ImageIcon(img));
        profileLabel.setBounds(125, 50, 100, 100);
        panel.add(profileLabel);

        JLabel nameLabel = new JLabel("Name: John Doe");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(50, 170, 250, 30);
        panel.add(nameLabel);

        JLabel phoneLabel = new JLabel("Phone: 9876543210");
        phoneLabel.setForeground(Color.WHITE);
        phoneLabel.setBounds(50, 210, 250, 30);
        panel.add(phoneLabel);

        JLabel emailLabel = new JLabel("Email: johndoe@example.com");
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setBounds(50, 250, 250, 30);
        panel.add(emailLabel);

        JLabel roleLabel = new JLabel("Role: Event Organizer");
        roleLabel.setForeground(Color.WHITE);
        roleLabel.setBounds(50, 290, 250, 30);
        panel.add(roleLabel);

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(125, 350, 100, 30);
        closeButton.addActionListener(ev -> dispose());
        panel.add(closeButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new UserProfileFrame(); // Ensure it runs properly
    }
}

