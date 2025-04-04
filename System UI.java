import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimeZone;

public class SettingsUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Settings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE); // Default background is White
        panel.setBounds(20, 20, 350, 330);
        panel.setLayout(null);
        frame.add(panel);

        JLabel titleLabel = new JLabel("SETTINGS");
        titleLabel.setFont(new Font("Courier New", Font.BOLD, 18));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setBounds(130, 10, 200, 30);
        panel.add(titleLabel);

        // Reset Button
        JButton resetButton = new JButton("Reset Everything");
        resetButton.setBounds(100, 50, 150, 30);
        panel.add(resetButton);

        // View History Button
        JButton historyButton = new JButton("View History");
        historyButton.setBounds(100, 90, 150, 30);
        panel.add(historyButton);

        // Time Zone Selection
        JLabel timeZoneLabel = new JLabel("Time Zone:");
        timeZoneLabel.setForeground(Color.BLACK);
        timeZoneLabel.setBounds(30, 130, 100, 25);
        panel.add(timeZoneLabel);

        String[] timeZones = TimeZone.getAvailableIDs();
        JComboBox<String> timeZoneDropdown = new JComboBox<>(timeZones);
        timeZoneDropdown.setBounds(130, 130, 180, 25);
        panel.add(timeZoneDropdown);

        // Logout Button
        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(100, 170, 150, 30);
        panel.add(logoutButton);

        // Extra Feature: Dark Mode Toggle
        JCheckBox darkModeCheckbox = new JCheckBox("Enable Dark Mode");
        darkModeCheckbox.setBounds(100, 210, 150, 30);
        darkModeCheckbox.setBackground(Color.WHITE);
        darkModeCheckbox.setForeground(Color.BLACK);
        panel.add(darkModeCheckbox);

        // Action Listeners
        resetButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "All settings have been reset!"));
        historyButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Event history not available yet."));
        logoutButton.addActionListener(e -> System.exit(0));

        // Dark Mode Toggle Action Listener
        darkModeCheckbox.addActionListener(e -> {
            if (darkModeCheckbox.isSelected()) {
                panel.setBackground(new Color(0, 51, 102)); // Dark Blue
                titleLabel.setForeground(Color.WHITE);
                timeZoneLabel.setForeground(Color.WHITE);
                darkModeCheckbox.setBackground(new Color(0, 51, 102));
                darkModeCheckbox.setForeground(Color.WHITE);
            } else {
                panel.setBackground(Color.WHITE);
                titleLabel.setForeground(Color.BLACK);
                timeZoneLabel.setForeground(Color.BLACK);
                darkModeCheckbox.setBackground(Color.WHITE);
                darkModeCheckbox.setForeground(Color.BLACK);
            }
        });

        frame.setVisible(true);
    }
}

