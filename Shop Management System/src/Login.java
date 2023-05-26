import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public Login() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();

                // Validate login credentials
                if (username.equals("admin") && String.valueOf(password).equals("password")) {
                    String generatedCode = generateCode();
                    JOptionPane.showMessageDialog(Login.this, "Login successful! Generated code: " + generatedCode);
                } else {
                    JOptionPane.showMessageDialog(Login.this, "Invalid username or password!");
                }
            }
        });

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); // Empty label for spacing
        add(loginButton);
    }

    public void showLoginForm() {
        setVisible(true);
    }

    private String generateCode() {
        // Your code generation logic here
        // Return the generated code as a String
        return "ABC123";
    }
}
