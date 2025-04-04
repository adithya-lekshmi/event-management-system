import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventManagementUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(null);

        // Main Panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 51, 102)); // Dark Blue
        panel.setBounds(20, 20, 550, 420);
        panel.setLayout(null);
        frame.add(panel);

        // Title Label
        JLabel titleLabel = new JLabel("EVENT ORGANIZER PRO");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(120, 20, 350, 30);
        panel.add(titleLabel);

        // Buttons
        String[] buttonTexts = {"LOGIN", "SEARCH EVENT", "EVENT REGISTER", "HOST AN EVENT", "MANAGE EVENTS", "EVENT FEEDBACK", "SETTINGS", "EXIT"};
        int yPosition = 80;

        for (String text : buttonTexts) {
            JButton button = new JButton(text);
            button.setBounds(150, yPosition, 250, 40);
            panel.add(button);
            yPosition += 50;

            if (text.equals("EXIT")) {
                button.addActionListener(e -> System.exit(0));
            } else if (text.equals("MANAGE EVENTS")) {
                button.addActionListener(e -> new ManageEventFrame());
            } else if (text.equals("EVENT REGISTER")) {
                button.addActionListener(e -> new EventRegisterFrame());
            } else if (text.equals("SETTINGS")) {
                button.addActionListener(e -> new SettingsFrame());
            }
        }

        frame.setVisible(true);
    }
}

class ManageEventFrame {
    public ManageEventFrame() {
        JFrame frame = new JFrame("Manage Event");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel titleLabel = new JLabel("MANAGE EVENT");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 18));
        titleLabel.setBounds(140, 10, 200, 30);
        frame.add(titleLabel);

        JLabel eventNameLabel = new JLabel("Event Name:");
        eventNameLabel.setBounds(30, 50, 100, 25);
        frame.add(eventNameLabel);
        JTextField eventNameField = new JTextField();
        eventNameField.setBounds(150, 50, 200, 25);
        frame.add(eventNameField);

        JLabel participantNameLabel = new JLabel("Participant Name:");
        participantNameLabel.setBounds(30, 90, 120, 25);
        frame.add(participantNameLabel);
        JTextField participantNameField = new JTextField();
        participantNameField.setBounds(150, 90, 200, 25);
        frame.add(participantNameField);

        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(30, 130, 100, 25);
        frame.add(phoneLabel);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(150, 130, 200, 25);
        frame.add(phoneField);

        JButton addParticipantButton = new JButton("Add Participant");
        addParticipantButton.setBounds(100, 170, 200, 30);
        frame.add(addParticipantButton);

        JButton scanQRButton = new JButton("Scan QR Code");
        scanQRButton.setBounds(100, 210, 200, 30);
        frame.add(scanQRButton);

        JCheckBox cateringRequired = new JCheckBox("Catering Required");
        cateringRequired.setBounds(100, 250, 200, 30);
        frame.add(cateringRequired);

        JButton submitEventButton = new JButton("Submit Event");
        submitEventButton.setBounds(100, 290, 200, 30);
        frame.add(submitEventButton);

        frame.setVisible(true);
    }
}

class EventRegisterFrame {
    public EventRegisterFrame() {
        JFrame frame = new JFrame("Register for Event");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLayout(null);

        JLabel titleLabel = new JLabel("REGISTER EVENT");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 18));
        titleLabel.setBounds(130, 10, 200, 30);
        frame.add(titleLabel);

        JLabel eventNameLabel = new JLabel("Event Name:");
        eventNameLabel.setBounds(30, 50, 100, 25);
        frame.add(eventNameLabel);
        JTextField eventNameField = new JTextField();
        eventNameField.setBounds(150, 50, 200, 25);
        frame.add(eventNameField);

        JLabel eventTimeLabel = new JLabel("Event Time:");
        eventTimeLabel.setBounds(30, 90, 100, 25);
        frame.add(eventTimeLabel);
        JTextField eventTimeField = new JTextField("19:12:30");
        eventTimeField.setBounds(150, 90, 200, 25);
        frame.add(eventTimeField);

        JLabel notifyLabel = new JLabel("Notify Before:");
        notifyLabel.setBounds(30, 130, 100, 25);
        frame.add(notifyLabel);
        String[] notifyOptions = {"10 min", "20 min", "30 min", "40 min", "50 min"};
        JComboBox<String> notifyDropdown = new JComboBox<>(notifyOptions);
        notifyDropdown.setBounds(150, 130, 100, 25);
        frame.add(notifyDropdown);

        frame.setVisible(true);
    }
}

class SettingsFrame {
    public SettingsFrame() {
        JFrame frame = new JFrame("Settings");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel titleLabel = new JLabel("SETTINGS");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 18));
        titleLabel.setBounds(140, 10, 200, 30);
        frame.add(titleLabel);

        JCheckBox darkMode = new JCheckBox("Dark Mode");
        darkMode.setBounds(100, 50, 200, 30);
        frame.add(darkMode);

        JCheckBox notifications = new JCheckBox("Enable Notifications");
        notifications.setBounds(100, 90, 200, 30);
        frame.add(notifications);

        JButton saveButton = new JButton("Save Settings");
        saveButton.setBounds(100, 130, 200, 30);
        frame.add(saveButton);

        frame.setVisible(true);
    }
}

