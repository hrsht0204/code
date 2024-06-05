import javax.swing.*;
import java.awt.*;

public class LoginUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create UI components (same as before)
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> {
            String enteredUsername = usernameField.getText();
            String enteredPassword = new String(passwordField.getPassword());

            // Set your predefined username and password
            String predefinedUsername = "Harsh";
            String predefinedPassword = "Abc@1234";

            if (enteredUsername.equals(predefinedUsername) && enteredPassword.equals(predefinedPassword)) {
                // Successful login
                JOptionPane.showMessageDialog(frame, "Login successful!");
            } else {
                // Invalid credentials
                JOptionPane.showMessageDialog(frame, "Invalid username or password. Please try again.");
            }
        });

        // Arrange components in a panel
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        // Center the window on the screen
        frame.setLocationRelativeTo(null);

        frame.add(panel);
        frame.setVisible(true);
    }
}
